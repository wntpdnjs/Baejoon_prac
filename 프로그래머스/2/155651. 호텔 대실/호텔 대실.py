from datetime import datetime


def solution(book_time):
    time_table = [0] * 1440
    answer = 0
    for i in range(len(book_time)) :
        
        start_time = datetime.strptime(book_time[i][0], '%H:%M').time()
        end_time = datetime.strptime(book_time[i][1], '%H:%M').time()
    
        start_point = start_time.hour*60 + start_time.minute
        end_point = end_time.hour*60 + end_time.minute +10
        end_point = min(end_point, 1440)
        
        for j in range(start_point, end_point):
            time_table[j] += 1
            
            
    answer = max(time_table)
    

    return answer