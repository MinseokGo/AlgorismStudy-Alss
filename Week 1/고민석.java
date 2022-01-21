/* Date : 2022-01-19
 * Program : Kakao test 2021-1-Problem3
 * Email : rhalstjr1999@naver.com
 * Author : MinseokGo
 */
class Problem3 {
    public int[] solution(String[] info, String[] query) {
        int[] answer = new int[query.length];
        String[] infoDivide = new String[5];
        String[] queryDivide1 = new String[4];
        String[] queryDivide2 = new String[2];
        
        for(int i=0; i<query.length; i++)
        {
            queryDivide1 = query[i].split(" and ");   
            queryDivide2 = queryDivide1[3].split(" ");   //food and score split
            for(int j=0; j<info.length; j++)
            {
                infoDivide = info[j].split(" ");
                if(queryDivide1[0].equals(infoDivide[0]) || queryDivide1[0].equals("-"))
                {
                    if(queryDivide1[1].equals(infoDivide[1]) || queryDivide1[1].equals("-"))
                    {
                        if(queryDivide1[2].equals(infoDivide[2]) || queryDivide1[2].equals("-"))
                        {
                             if(queryDivide2[0].equals(infoDivide[3]) || queryDivide2[0].equals("-"))
                             {
                                if(Integer.parseInt(queryDivide2[1]) <= Integer.parseInt(infoDivide[4]))
                                {
                                    answer[i]++;
                                }
                             }
                        }
                    }
                }
            }
        }
        return answer;
    } 
}