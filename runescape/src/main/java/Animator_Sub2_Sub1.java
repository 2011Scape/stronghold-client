import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public final class Animator_Sub2_Sub1 extends Animator_Sub2 {

    @OriginalMember(owner = "client!wb", name = "W", descriptor = "I")
    public int anInt10508;

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lclient!eo;)V")
    public Animator_Sub2_Sub1(@OriginalArg(0) Renderable arg0) {
        super(arg0, false);
    }
}
