def search_matrix(matrix, target)
  return false if matrix.empty? || matrix.first.empty? ||target.nil?
  m = matrix.length - 1
  n = 0

  while (m >=0 && n <= matrix.first.length - 1)
    puts m
    puts n
    puts matrix[m][n]
    return true if matrix[m][n] == target

    if matrix[m][n] > target
      m -= 1
    else
      n += 1
    end
  end

  return false
end

search_matrix [[-1], [-1]], -1
