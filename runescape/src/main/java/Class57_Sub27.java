import com.jagex.core.constants.ModeGame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sga")
public final class Class57_Sub27 extends Class57 {

    @OriginalMember(owner = "client!sga", name = "<init>", descriptor = "(ILclient!kv;)V")
    public Class57_Sub27(@OriginalArg(0) int arg0, @OriginalArg(1) ClientOptions arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!sga", name = "<init>", descriptor = "(Lclient!kv;)V")
    public Class57_Sub27(@OriginalArg(0) ClientOptions arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(ZI)V")
    @Override
    protected void method8353(@OriginalArg(1) int arg0) {
        super.anInt9489 = arg0;
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(IB)I")
    @Override
    public int method8352(@OriginalArg(0) int arg0) {
        return 1;
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(B)V")
    @Override
    public void method8350() {
        if (super.aClass2_Sub34_34.method5105() == ModeGame.STELLAR_DAWN) {
            super.anInt9489 = 2;
        }
        if (super.anInt9489 < 0 || super.anInt9489 > 2) {
            super.anInt9489 = this.method8354();
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(I)I")
    @Override
    protected int method8354() {
        return 1;
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(Z)I")
    public int method7667() {
        return super.anInt9489;
    }
}
