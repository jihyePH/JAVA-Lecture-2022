package ch06;

public class Ex22_GetterSetter {
		private int number;
		private boolean success;
		private boolean acceptable;
		private String name;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public boolean isAcceptable() {  	//boolean인 경우is로 시작함
			return acceptable;
		}
		public void setAcceptable(boolean acceptable) {
			this.acceptable = acceptable;
		}		
		public int getNumber() {
			return number;
		}
		public void setNumber(int number) { 	//number는 100이상1000미만
			if (number >= 100 && number <= 100) {
				this.number = number;
				success = true; 		//성공하면
				return;
		}
			success = false; 	//실패하면
				
	}
		public boolean isSuccess() { 		//number가 수정되면 true, 아니면false 
			return success;
		}
		
		@Override 		//부모로부터 상속받은 정보
		public String toString() {
			return "Ex22_GetterSetter [number=" + number + ", success=" + success + ", acceptable=" + acceptable
					+ ", name=" + name + "]";
		}
		
}


