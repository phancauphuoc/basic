package com.theplayer.kits;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class asd {
	
	private int answer;
	private boolean[] flag;
	private int hundred;
	private int ten;
	private int one;
	private int done;
	public void ready() {
		// TODO Auto-generated method stub
		answer = 759;
		flag = new boolean[10];
		Arrays.fill(flag, false);
		hundred = 1;
		ten = hundred+1;
		one = ten+1;
		done = 0;
	}

	public Map<String, Integer> reply(int value) {
		// TODO Auto-generated method stub
		int strike = 0;
		int ball = 0;
		int a = answer;
		for(int i = 0; i < 3; i+=1) {
			int iv = a % 10;
			a /= 10;
			int v = value;
			for(int k = 0; k < 3; k+=1) {
				int kv = v % 10;
				v /= 10;
				if( iv == kv ) {
					if( i == k ) {
						strike += 1;
					}else {
						ball += 1;
					}
				}				
			}
		}
		Map<String, Integer> map = new HashMap<String,Integer>();
		map.put("strike", strike);
		map.put("ball", ball);
		return map;
	}

	public int call() {
		// TODO Auto-generated method stub
		int call=0;
		if( done == 0 ) {
			while(flag[hundred]) hundred =hundred%9 +1;
			ten = (hundred+1)%9+1;
			while(flag[ten]) ten =ten%9 +1;
			one = (ten+1)%9+1;
			while(flag[one]) one =one%9 +1;
			call = (hundred*100)+(ten*10)+(one);
		}else {
			switch(done) {
			case 1:
				call = (ten*100)+(hundred*10)+(one);// 213
			break;
			case 2:
				call = (hundred*100)+(one*10)+(ten);// 132
			break;
			case 3:
				call = (one*100)+(ten*10)+(hundred);// 321
			break;
			case 4:
				call = (ten*100)+(one*10)+(hundred);// 231
			break;
			case 5:
				call = (one*100)+(hundred*10)+(ten);// 312
			break;
			case 6:
				call = (hundred*100)+(ten*10)+(one);// 123
			break;
			}
			done+=1;
		}
		return call;
	}

	public void predict(int strike, int ball) {
		// TODO Auto-generated method stub
		if( strike == 0 && ball == 0 ) {
			flag[hundred] = true;
			flag[ten] = true;
			flag[one] = true;
		}
		if( strike + ball == 3 ) {
			done = 1;
		}else {
			hundred += 1;
		}
	}

}
