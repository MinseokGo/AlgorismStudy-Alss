#include <iostream>

#define N 10

using namespace std;

int main()
{
	int a[2][N] = {
		{2, 5, 1, 6, 3, 8, 0, 9, 4, 7},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
	};
	int tmp;
	
	/*

	0 <= q, w <= N , q != w
	count[2][N] 생성
	count[0][0 ~ N]에 a[0 ~ N]을 복사
	if문 진입후에 a[j]와a[j + 1]을 count[0][0 ~ N]을 비교
	만약 a[j] = count[0][N-q],a[j + 1] = count[0][N-w]과 같았다면
	count[1][N - q] 와 count[1][N - w]에 1을 더해주는식

	또는 
	a[2][N] 생성 
	a[0][0 ~ N]을 데이터 a[1][0 ~ N]을 이동 횟수라고 한다면
	a[1][0 ~ N]모두 0으로 리셋
	if문 진입 후 a[0][j], a[0][j + 1]가 교환될 때
	a[1][j], a[1][j + 1]에 각각 1을 더한 후
	a[1][j]와 a[1][j + 1]을 교환하다 보면 
	마지막엔 a[1][어떤수]는 a[0][어떤수]의 이동횟수가 되어있을 것이다.

	*/

	for(int i = 0; i < N; i++){
		for(int j = 0; j < N - i - 1; j++){
			if(a[0][j] > a[0][j + 1]){
				// 데이터 교환
				tmp = a[0][j + 1];
				a[0][j + 1] = a[0][j];
				a[0][j] = tmp;
				// 이동 횟수 증가
				a[1][j + 1]++;
				a[1][j]++;
				// 이동 횟수 교환
				tmp = a[1][j + 1];
				a[1][j + 1] = a[1][j];
				a[1][j] = tmp;
			}
		}
	}

	for(int i = 0; i < N; i++){
		cout << "데이터 : " << a[0][i];
		cout << "	이동횟수 : " << a[1][i] << endl;
	}

    return 0;
}