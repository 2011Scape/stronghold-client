import com.jagex.core.io.Packet;
import com.jagex.game.runetek6.config.loctype.LocInteractivity;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "I")
    public static int anInt3469;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
    public static int anInt3475;

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "I")
    public static int anInt3470 = 0;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "I")
    public static int anInt3471 = 0;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
    public static int anInt3472 = 0;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "([BIIIII)Z")
    public static boolean method3141(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
        @Pc(5) boolean local5 = true;
        @Pc(10) Packet local10 = new Packet(arg0);
        @Pc(12) int local12 = -1;
        label54:
        while (true) {
            @Pc(16) int local16 = local10.gExtended1or2();
            if (local16 == 0) {
                return local5;
            }
            local12 += local16;
            @Pc(24) int local24 = 0;
            @Pc(26) boolean local26 = false;
            while (true) {
                @Pc(32) int local32;
                while (!local26) {
                    local32 = local10.gsmart();
                    if (local32 == 0) {
                        continue label54;
                    }
                    local24 += local32 - 1;
                    @Pc(59) int local59 = local24 & 0x3F;
                    @Pc(65) int local65 = local24 >> 6 & 0x3F;
                    @Pc(71) int local71 = local10.g1() >> 2;
                    @Pc(75) int local75 = arg1 + local65;
                    @Pc(79) int local79 = local59 + arg3;
                    if (local75 > 0 && local79 > 0 && arg2 - 1 > local75 && arg4 - 1 > local79) {
                        @Pc(111) LocType local111 = Static354.aLocTypeList_4.list(local12);
                        if (local71 != 22 || Static400.instance.groundDecor.value() != 0 || local111.interactivity != LocInteractivity.NONINTERACTIVE || local111.movementPolicy == 1 || local111.obstructiveGround) {
                            local26 = true;
                            if (!local111.isLoaded()) {
                                local5 = false;
                                Static13.anInt150++;
                            }
                        }
                    }
                }
                local32 = local10.gsmart();
                if (local32 == 0) {
                    break;
                }
                local10.g1();
            }
        }
    }
}
