package com.water.www;

public class Water {
	interface Glv{//过滤
		public abstract void filter();	
	}
	interface Hcong{//缓冲
		public abstract void buffer();
	}
	interface Jre{//加热
		public abstract void warm();	
	}
	interface Ftang{//放糖
		public abstract void sugaring();
	}
}
