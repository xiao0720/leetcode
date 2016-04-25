# Problem: # 338 Counting Bits
# Idea:
# Solutions:
# Note: #canbefaster

# @param {Integer} num
# @return {Integer[]}
def count_bits(num)
  arr = []
  (0..num).each do |n|
    arr << n.to_s(2).count("1")
  end
  arr
end
