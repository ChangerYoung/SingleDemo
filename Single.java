/*
*延迟加载的单例设计模式实例
*懒汉模式，在调用的时候加载，起到延迟加载的效果
*但是延迟加载会出现线程不安全的情况，所以需要用到同步代码块synchronized
*synchronized代码块会消耗系统资源，所以应尽可能少的进行判断，故采用双判断形式
*/
class Single{
	private static Single s = null;
	private Single(){}
	private static Single getInstence(){
		if(s==null){
			synchronized(Single.class){
				if(s==null){
					s = new Single();
				}
			}
		}
		return s;
	}
}