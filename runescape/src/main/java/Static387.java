import com.jagex.core.stringtools.general.Cp1252;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V")
    public static void method5440() {
        if (Static164.anInt2809 < 0) {
            Static180.anInt3001 = -1;
            Static558.anInt3181 = -1;
            Static164.anInt2809 = 0;
        }
        if (Static30.anInt5650 < Static164.anInt2809) {
            Static180.anInt3001 = -1;
            Static164.anInt2809 = Static30.anInt5650;
            Static558.anInt3181 = -1;
        }
        if (Static615.anInt9389 < 0) {
            Static558.anInt3181 = -1;
            Static180.anInt3001 = -1;
            Static615.anInt9389 = 0;
        }
        if (Static30.anInt5644 < Static615.anInt9389) {
            Static558.anInt3181 = -1;
            Static180.anInt3001 = -1;
            Static615.anInt9389 = Static30.anInt5644;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!ge;II)Ljava/lang/String;")
    public static String method5441(@OriginalArg(0) Packet arg0) {
        try {
            @Pc(7) int local7 = arg0.gsmart();
            if (local7 > 32767) {
                local7 = 32767;
            }
            @Pc(19) byte[] local19 = new byte[local7];
            arg0.pos += Static636.aClass197_1.method4438(local19, arg0.data, local7, arg0.pos, 0);
            return Cp1252.decode(0, local19, local7);
        } catch (@Pc(53) Exception local53) {
            return "Cabbage";
        }
    }
}
