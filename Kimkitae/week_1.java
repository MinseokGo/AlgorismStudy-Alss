package com.kimkitae;

class week_1 {
    public static int[] solution(String[] info, String[] query) {
    int[] answer = {};
    String[][] splitInfo = new String[info.length][5]; //array to hold split info
    String[][] splitQuery = new String[info.length][5]; //array to hold split query

    for(int i = 0; i < info.length; i ++){
        splitInfo[i] = info[i].toString().split(" ");
        splitQuery[i] = query[i].toString().split(" and ",4);
        String tmp = splitQuery[i][3].split(" ",2)[1];
        splitQuery[i][4] = tmp;

    }

    for(int i = 0; i < info.length; i ++){
        for(int j = 0; j < 5; j ++){
            System.out.println(splitInfo[i][j]);
            System.out.println(splitQuery[i][j]);
        }
    }

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
                solution(i,q);
    }

}
