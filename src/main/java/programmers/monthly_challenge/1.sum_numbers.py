def solution(numbers) :
    result = set()
    
    for i in range(len(numbers)) :
        for j in range(i+1, len(numbers)) :
            result.add(numbers[i] + numbers [j])
            
    return sorted(result)

print(solution([2,1,3,4,1]))
print(solution([5,0,2,7]))

# 풀이 설명
# 1.	result_set을 set()으로 초기화하여 중복된 합을 자동으로 제거합니다.
# 2.	for 문을 두 개 사용하여 numbers 리스트의 서로 다른 두 요소를 선택하여 합을 구합니다.
# 3.	result_set.add(numbers[i] + numbers[j])를 사용하여 합을 set에 추가합니다.
# 4.	마지막으로 sorted(result_set)을 호출하여 오름차순으로 정렬된 리스트를 반환합니다.

# 시간 복잡도 분석
# 	•	numbers의 길이는 최대 100이므로, 두 개의 숫자를 선택하는 방식은 O(N²) (최대 100 × 100 = 10,000 번)입니다.
# 	•	set은 평균적으로 O(1) 시간 복잡도를 가지므로 중복 체크는 빠르게 이루어집니다.
# 	•	마지막 정렬 단계는 O(M log M) (M은 중복을 제거한 결과의 개수, 최악의 경우 100개)입니다.
# 	•	따라서 전체적인 시간 복잡도는 **O(N² + M log M)**이며, 이는 충분히 빠르게 동작할 수 있습니다.

from itertools import combinations

def solution2(numbers) :
    return sorted(set(sum(pair) for pair in combinations(numbers, 2)))
    
print(solution2([2,1,3,4,1]))
print(solution2([5,0,2,7]))

