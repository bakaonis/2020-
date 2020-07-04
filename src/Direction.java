
public enum Direction {
	LEFT{
		public boolean left() {return true;}
	},
	RIGHT{
		public boolean right() {return true;}
	},
	UP,
	DOWN;
	public boolean left() {
		return false;
	}
	public boolean right() {
		return false;
	}
}
