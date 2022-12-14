package none.event.events;

import net.minecraft.entity.EntityLivingBase;
import none.event.Event;

/**
 * Created by Arithmo on 5/1/2017 at 1:02 AM.
 */
public class EventRenderEntity extends Event {

    private EntityLivingBase entity;
    private boolean pre;

    public void fire(EntityLivingBase entity, boolean pre) {
        this.entity = entity;
        this.pre = pre;
        super.fire();
    }

    public EntityLivingBase getEntity() {
        return entity;
    }

    public boolean isPre() {
        return pre;
    }

    public boolean isPost() {
        return !pre;
    }

}
