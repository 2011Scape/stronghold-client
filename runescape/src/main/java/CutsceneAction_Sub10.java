import com.jagex.core.io.Packet;
import com.jagex.core.util.TimeUtils;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hs")
public final class CutsceneAction_Sub10 extends CutsceneAction {

    @OriginalMember(owner = "client!hs", name = "o", descriptor = "I")
    public final int anInt4120;

    @OriginalMember(owner = "client!hs", name = "j", descriptor = "I")
    public final int anInt4119;

    @OriginalMember(owner = "client!hs", name = "k", descriptor = "I")
    public final int anInt4125;

    @OriginalMember(owner = "client!hs", name = "l", descriptor = "I")
    public final int anInt4123;

    @OriginalMember(owner = "client!hs", name = "g", descriptor = "I")
    public final int anInt4126;

    @OriginalMember(owner = "client!hs", name = "h", descriptor = "I")
    public final int anInt4122;

    @OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Lclient!ge;)V")
    public CutsceneAction_Sub10(@OriginalArg(0) Packet arg0) {
        super(arg0);
        this.anInt4120 = arg0.g2();
        @Pc(13) int local13 = arg0.g1();
        if ((local13 & 0x1) == 0) {
            this.anInt4119 = -1;
            this.anInt4125 = -1;
        } else {
            this.anInt4119 = arg0.g2();
            this.anInt4125 = arg0.g2();
        }
        if ((local13 & 0x2) == 0) {
            this.anInt4126 = -1;
            this.anInt4123 = -1;
        } else {
            this.anInt4123 = arg0.g2();
            this.anInt4126 = arg0.g2();
        }
        if ((local13 & 0x4) == 0) {
            this.anInt4122 = -1;
        } else {
            @Pc(84) int local84 = arg0.g2();
            @Pc(88) int local88 = arg0.g2();
            @Pc(94) int local94 = local84 * 255 / local88;
            if (local84 > 0 && local94 < 1) {
                local94 = 1;
            }
            this.anInt4122 = local94;
        }
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(I)V")
    @Override
    public void execute() {
        CutsceneManager.actors[this.anInt4120].entity().hit(this.anInt4126, 0, this.anInt4122, this.anInt4125, TimeUtils.clock, this.anInt4123, this.anInt4119);
    }
}
