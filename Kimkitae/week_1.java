class week_1 {
    public static int[] solution(String[] info, String[] query) {
        int[] answer = new int[query.length];
        String[][] splitInfo = new String[info.length][5]; //array to hold split info
        String[][] splitQuery = new String[query.length][5]; //array to hold split query

        for(int i = 0; i < info.length; i ++){
            splitInfo[i] = info[i].toString().split(" ");
        }

        for(int i = 0; i < query.length; i ++){
            if(splitQuery[i].length == 5){
                splitQuery[i] = query[i].toString().split(" and ",4);
                String tmp1 = splitQuery[i][3].split(" ",2)[0];
                String tmp2 = splitQuery[i][3].split(" ",2)[1];
                System.out.println(tmp1 + tmp2);
                splitQuery[i][3] = tmp1;
                splitQuery[i][4] = tmp2;
            }
        }

        // 알수없는 익셉션으로 코딩이 너무 어려워 주석으로 기술 하겠습니다.
        // split 으로 나누어진 for문을 이용하여 splitQuery[0 ~ query.length - 1][0 ~ 4] 이 '-' 을 제외한 모든 부분을 
        // splitInfo[0 ~ info.length - 1][0 ~ 4]이 포함하고 있다면  
        // answer[0 ~ query.length - 1] 에 1을 더한다.

/*
        for(int i = 0; i < info.length; i ++){
            for(int j = 0; j < info[i].length; j ++){
                System.out.println(splitInfo[i][j]);
            }
        }

        for(int i = 0; i < query.length; i ++){
            for(int j = 0; j < query[i].length; j ++){
                System.out.println(splitQuery[i][j]);
            }
        }
*/
        return answer;
    }

    public static void main(String[] args) {
        String[] i = {
                "java backend junior pizza 150",
                "python frontend senior chicken 210",
                "python frontend senior chicken 150",
                "cpp backend senior pizza 260",
                "java backend junior chicken 80",
                "python backend senior chicken 50"};
        String[] q = {
                "java and backend and junior and pizza 100",
                "python and frontend and senior and chicken 200",
                "cpp and - and senior and pizza 250",
                "- and backend and senior and - 150",
                "- and - and - and chicken 100",
                "- and - and - and - 150"
        };
        int[] s = solution(i,q);
    }

}