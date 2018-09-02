require "pry"

class Solution
  def initialize words, max_width
    @words = words
    @max_width = max_width
  end

  def solve
    group = []
    result = []
    current_width = 0

    @words.each do |w|
      if w.length <= @max_width - current_width
        group << w
        current_width += w.length + 1
      else
        result << group
        group = [w]
        current_width = w.length + 1
      end
    end

    result << group unless group.empty?

    output = []

    result.each_with_index do |group, index|
      n = group.length - 1
      total_space = @max_width - group.map(&:length).reduce(:+)
      space = (n == 0) ? total_space : total_space / n
      residule = (n == 0) ? 0 : total_space % n
      o = []

      if result.length - 1 == index
        o << group.join(" ")
        o << " " * (total_space - n)
      else
        group.each_with_index do |item, i|
          if i == group.length - 1 && group.length != 1
            o << item
          else
            o << item + " " * space
          end

          if residule > 0
            o << " "
            residule -= 1
          end
        end
      end

      output << o.join
    end

    output
  end
end
