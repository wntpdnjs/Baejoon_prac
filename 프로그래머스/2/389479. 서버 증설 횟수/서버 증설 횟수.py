def solution(players, m, k):
    server = [m] * (24+k)
    sum = 0
    answer = 0
    
    for i in range (len(players)):
        while( server[i] <= players[i] ):
            for j in range(i,i+k) :
                server[j] += m
            sum += 1
    
    answer = sum
    return answer