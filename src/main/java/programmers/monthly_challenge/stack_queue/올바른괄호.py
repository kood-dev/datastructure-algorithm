# 풀이 방법
# 	1.	스택을 사용한 방법
# 	•	'('를 만나면 스택에 push
# 	•	')'를 만나면 스택에서 pop (만약 스택이 비어있다면 잘못된 괄호)
# 	•	모든 문자를 확인한 후 스택이 비어 있다면 올바른 괄호, 그렇지 않다면 잘못된 괄호
# 	2.	카운트 변수 사용 (스택 없이 O(1) 메모리)
# 	•	'('를 만나면 카운트를 증가
# 	•	')'를 만나면 카운트를 감소
# 	•	중간에 카운트가 음수가 되면 false 반환
# 	•	최종적으로 카운트가 0이면 true, 그렇지 않으면 false

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