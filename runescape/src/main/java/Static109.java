import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
    public static int anInt2178;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lclient!eo;)V")
    public static void method2068(@OriginalArg(0) Entity arg0) {
        if (arg0 == null) {
            return;
        }
        for (@Pc(5) int local5 = 0; local5 < 2; local5++) {
            @Pc(8) Entity local8 = null;
            for (@Pc(12) Entity local12 = Static576.aEntityArray9[local5]; local12 != null; local12 = local12.aEntity_25) {
                if (local12 == arg0) {
                    if (local8 == null) {
                        Static576.aEntityArray9[local5] = local12.aEntity_25;
                    } else {
                        local8.aEntity_25 = local12.aEntity_25;
                    }
                    Static75.aBoolean521 = true;
                    return;
                }
                local8 = local12;
            }
            local8 = null;
            for (@Pc(47) Entity local47 = Static398.aEntityArray7[local5]; local47 != null; local47 = local47.aEntity_25) {
                if (local47 == arg0) {
                    if (local8 == null) {
                        Static398.aEntityArray7[local5] = local47.aEntity_25;
                    } else {
                        local8.aEntity_25 = local47.aEntity_25;
                    }
                    Static75.aBoolean521 = true;
                    return;
                }
                local8 = local47;
            }
            local8 = null;
            for (@Pc(82) Entity local82 = Static468.aEntityArray10[local5]; local82 != null; local82 = local82.aEntity_25) {
                if (local82 == arg0) {
                    if (local8 == null) {
                        Static468.aEntityArray10[local5] = local82.aEntity_25;
                    } else {
                        local8.aEntity_25 = local82.aEntity_25;
                    }
                    Static75.aBoolean521 = true;
                    return;
                }
                local8 = local82;
            }
        }
    }

}
