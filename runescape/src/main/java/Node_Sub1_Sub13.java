import com.jagex.core.io.Packet;
import com.jagex.graphics.EnvironmentLight;
import com.jagex.graphics.texture.TextureOp;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jr")
public final class Node_Sub1_Sub13 extends TextureOp {

    @OriginalMember(owner = "client!jr", name = "F", descriptor = "I")
    public int anInt4951 = 1024;

    @OriginalMember(owner = "client!jr", name = "L", descriptor = "I")
    public int anInt4956 = 2048;

    @OriginalMember(owner = "client!jr", name = "G", descriptor = "I")
    public int anInt4954 = 3072;

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "()V")
    public Node_Sub1_Sub13() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "(I)V")
    @Override
    public void method9421() {
        this.anInt4956 = this.anInt4954 - this.anInt4951;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IZ)[[I")
    @Override
    public int[][] method9414(@OriginalArg(0) int arg0) {
        @Pc(21) int[][] local21 = super.colourCache.get(arg0);
        if (super.colourCache.dirty) {
            @Pc(31) int[][] local31 = this.method9413(0, arg0);
            @Pc(35) int[] local35 = local31[0];
            @Pc(39) int[] local39 = local31[1];
            @Pc(43) int[] local43 = local31[2];
            @Pc(47) int[] local47 = local21[0];
            @Pc(51) int[] local51 = local21[1];
            @Pc(55) int[] local55 = local21[2];
            for (@Pc(57) int local57 = 0; local57 < EnvironmentLight.anInt9289; local57++) {
                local47[local57] = this.anInt4951 + (local35[local57] * this.anInt4956 >> 12);
                local51[local57] = (this.anInt4956 * local39[local57] >> 12) + this.anInt4951;
                local55[local57] = (this.anInt4956 * local43[local57] >> 12) + this.anInt4951;
            }
        }
        return local21;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(II)[I")
    @Override
    public int[] monochromeOutput(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
        @Pc(11) int[] local11 = super.monochromeCache.get(arg1);
        if (super.monochromeCache.dirty) {
            @Pc(21) int[] local21 = this.method9422(arg1, 0);
            for (@Pc(23) int local23 = 0; local23 < EnvironmentLight.anInt9289; local23++) {
                local11[local23] = (this.anInt4956 * local21[local23] >> 12) + this.anInt4951;
            }
        }
        if (arg0 < 107) {
            this.anInt4956 = -15;
        }
        return local11;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(ZLclient!ge;I)V")
    @Override
    public void method9416(@OriginalArg(0) boolean arg0, @OriginalArg(1) Packet arg1, @OriginalArg(2) int arg2) {
        if (arg0) {
            this.method9421();
        }
        if (arg2 == 0) {
            this.anInt4951 = arg1.g2();
        } else if (arg2 == 1) {
            this.anInt4954 = arg1.g2();
        } else if (arg2 == 2) {
            super.monochrome = arg1.g1() == 1;
        }
    }
}
