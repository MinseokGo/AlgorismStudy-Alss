#include <iostream>
//#include<algorithm>

using namespace std;

int search(int[], int index_low, int index_high, int key);

int main()
{
	const int SIZE = 20;

	int bs[SIZE];
	int key = 4;

	for(int i = 0; i < SIZE; i++)
		bs[i] = 2 * i;

	cout << key << endl;


	// at searching
	if(key == search(bs, 0, SIZE - 1, key))
	{
		cout << "찾았다!!" << endl;
	}
	else 
	{
		cout << "틀렸다!!" << search(bs, 0, SIZE - 1, key) << endl;
	}

	

	return 0;
}

int search(int arr[], int low, int high, int key)
{
	if (low > high)
	{
		return -1;
	} 

	int mid = (low + high) / 2;	// get mid_index

	if(arr[mid] > key)  // if arr[low] < key < arr[mid] < arr[high]
	{
		high = mid - 1;
		return search(arr, low, high, key);
	}
	else if(arr[mid] < key)	// if arr[low] < arr[mid] < key < arr[high]
	{
		low = mid + 1;
		return search(arr, low, high, key);
	}
	else 					// if arr[mid] == key
	{
		return arr[mid];
	}
}

