# 풀이 방법
# 	1.	스택을 사용한 방법
# 		'('를 만나면 스택에 push
# 		')'를 만나면 스택에서 pop (만약 스택이 비어있다면 잘못된 괄호)
# 	    모든 문자를 확인한 후 스택이 비어 있다면 올바른 괄호, 그렇지 않다면 잘못된 괄호
# 	2.	카운트 변수 사용 (스택 없이 O(1) 메모리)
# 		'('를 만나면 카운트를 증가
# 		')'를 만나면 카운트를 감소
# 		중간에 카운트가 음수가 되면 false 반환
# 		최종적으로 카운트가 0이면 true, 그렇지 않으면 false

# 시간 복잡도: O(N) (문자열을 한 번 순회)
# 공간 복잡도: O(N) (최대 스택에 모든 ‘(’ 저장 가능)

def solution(s):
    stack = []
    
    for char in s:
        if char == '(':
            stack.append(char)
        else:  # char == ')'
            if not stack:
                return False  # 스택이 비어 있으면 잘못된 괄호
            stack.pop()  # 올바른 '('와 ')' 짝을 맞춤
    
    return not stack  # 스택이 비어 있으면 True, 아니면 False


print(solution("()()"))   # True
print(solution("(())()")) # True
print(solution(")()("))   # False
print(solution("(()("))   # False
print(solution("((()))")) # True
print(solution("())("))   # False


def solution(s):
    count = 0 
    
    for char in s:
        if char == '(':
            count += 1
        else:  # char == ')'
            count -= 1
            if count < 0:
                return False
    
    # 최종적으로 0이어야 올바른 괄호
    return count == 0  


print(solution("()()"))   # True
print(solution("(())()")) # True
print(solution(")()("))   # False
print(solution("(()("))   # False
print(solution("((()))")) # True
print(solution("())("))   # False


