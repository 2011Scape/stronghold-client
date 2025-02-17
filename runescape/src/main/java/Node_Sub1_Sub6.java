import com.jagex.core.io.Packet;
import com.jagex.graphics.EnvironmentLight;
import com.jagex.graphics.texture.TextureOp;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cma")
public final class Node_Sub1_Sub6 extends TextureOp {

    @OriginalMember(owner = "client!cma", name = "K", descriptor = "I")
    public int anInt1800 = 0;

    @OriginalMember(owner = "client!cma", name = "F", descriptor = "I")
    public int anInt1802 = 4096;

    @OriginalMember(owner = "client!cma", name = "<init>", descriptor = "()V")
    public Node_Sub1_Sub6() {
        super(1, true);
    }

    @OriginalMember(owner = "client!cma", name = "a", descriptor = "(II)[I")
    @Override
    public int[] monochromeOutput(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
        @Pc(11) int[] local11 = super.monochromeCache.get(arg1);
        if (super.monochromeCache.dirty) {
            @Pc(21) int[] local21 = this.method9422(arg1, 0);
            for (@Pc(23) int local23 = 0; local23 < EnvironmentLight.anInt9289; local23++) {
                @Pc(29) int local29 = local21[local23];
                local11[local23] = this.anInt1800 <= local29 && this.anInt1802 >= local29 ? 4096 : 0;
            }
        }
        return arg0 < 107 ? null : local11;
    }

    @OriginalMember(owner = "client!cma", name = "a", descriptor = "(ZLclient!ge;I)V")
    @Override
    public void method9416(@OriginalArg(0) boolean arg0, @OriginalArg(1) Packet arg1, @OriginalArg(2) int arg2) {
        if (arg2 == 0) {
            this.anInt1800 = arg1.g2();
        } else if (arg2 == 1) {
            this.anInt1802 = arg1.g2();
        }
        if (!arg0) {
            ;
        }
    }
}
