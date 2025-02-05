def solution(numbers) :
    result = set()
    
    for i in range(len(numbers)) :
        for j in range(i+1, len(numbers)) :
            result.add(numbers[i] + numbers [j])
            
    return sorted(result)

print(solution([2,1,3,4,1]))
print(solution([5,0,2,7]))

from itertools import combinations

def solution2(numbers) :
    return sorted(set(sum(pair) for pair in combinations(numbers, 2)))
    
print(solution2([2,1,3,4,1]))
print(solution2([5,0,2,7]))