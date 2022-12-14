package none.event.events;

import none.event.Event;

public class EventJump extends Event{
	private double motionY;
    private boolean pre;

    public void fire(double motionY, boolean pre) {
    	this.motionY = motionY;
        this.pre = pre;
        super.fire();
    }

    public double getMotionY() {
        return motionY;
    }
    public void setMotionY(double motiony) {
        this.motionY = motiony;
    }

    public boolean isPre() {
        return pre;
    }

    public boolean isPost() {
        return !pre;
    }
}
