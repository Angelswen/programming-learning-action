#ifndef MATRIX_H_INCLUDED
#define MATRIX_H_INCLUDED
#include<iostream>
using namespace std;
//全局变量，行列数
const int Row = 4,Col = 4;

class Matrix{
	int i,j;
	double a[Row][Col];
public:
    //构造函数,默认值为0
	Matrix(){
		for(i=0;i<Row;i++){
			for(j=0;j<Col;j++){
				a[i][j] = 0;
			}
		}
	}
	//复制构造函数
	Matrix(Matrix& m){
		for(i=0;i<Row;i++){
			for(j=0;j<Col;j++){
				a[i][j] = m.a[i][j];
			}
		}
	}
	//重载操作符+，-，<<
	Matrix operator+(Matrix&);
	Matrix operator-(Matrix&);
	friend ostream & operator<<(ostream &out,Matrix &m);
	//输入数据
	void input();
};

#endif // MATRIX_H_INCLUDED
