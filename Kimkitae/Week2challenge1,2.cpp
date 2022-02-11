#include <iostream>

#define N 10

using namespace std;

int main()
{
	int a[N] = {2, 5, 1, 6, 3, 4, 7, 8, 0, 9};
	int tmp;
	int count = 0;

	for(int i = 0; i < N; i++){
		for(int j = 0; j < N - i - 1; j++){
			if(a[j] > a[j + 1]){
				tmp = a[j + 1];
				a[j + 1] = a[j];
				a[j] = tmp;
				count++;
			}
		}
	}
	double effic = (double)count / (N * (N - 1) / 2) * 100;
			// N >= 2 일때 비교횟수는 아시다싶이 N(N - 1) / 2으로 고정 입니다. 
			// 자리바꿈횟수는 count 이다.
			// 각 숫자의 이동 횟수는 2count 이다.

	for(int i = 0; i < N; i++){
		cout << "답 : " << a[i] << endl;
	}
	cout << "효율(자리바꿈횟수/비교횟수) : " << effic << "%" << endl;

    return 0;
}