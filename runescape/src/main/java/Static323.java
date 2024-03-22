import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

    @OriginalMember(owner = "client!kda", name = "f", descriptor = "I")
    public static int anInt5118;

    @OriginalMember(owner = "client!kda", name = "d", descriptor = "I")
    public static int anInt5119;

    @OriginalMember(owner = "client!kda", name = "h", descriptor = "I")
    public static int anInt5120;

    @OriginalMember(owner = "client!kda", name = "j", descriptor = "I")
    public static int anInt5121 = 0;

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "()V")
    public static void method4624() {
        for (@Pc(1) int local1 = Static296.anInt4792; local1 < Static299.anInt4824; local1++) {
            for (@Pc(4) int local4 = 0; local4 < Static619.anInt1566; local4++) {
                for (@Pc(7) int local7 = 0; local7 < Static662.anInt9843; local7++) {
                    @Pc(16) Class291 local16 = Static334.activeTiles[local1][local4][local7];
                    if (local16 != null) {
                        @Pc(21) Wall local21 = local16.aClass8_Sub2_Sub3_2;
                        @Pc(24) Wall local24 = local16.aWall_1;
                        if (local21 != null && local21.method9290(0)) {
                            Static535.method7148(local21, local1, local4, local7, 1, 1);
                            if (local24 != null && local24.method9290(0)) {
                                Static535.method7148(local24, local1, local4, local7, 1, 1);
                                local24.method9285(0, false, Static665.aToolkit_15, 0, (byte) 126, 0, local21);
                                local24.method9280(27811);
                            }
                            local21.method9280(27811);
                        }
                        for (@Pc(76) Class286 local76 = local16.aClass286_2; local76 != null; local76 = local76.aClass286_1) {
                            @Pc(80) PositionEntity local80 = local76.aPositionEntity;
                            if (local80 != null && local80.method9290(0)) {
                                Static535.method7148(local80, local1, local4, local7, local80.aShort134 + 1 - local80.aShort131, local80.aShort133 - local80.aShort132 + 1);
                                local80.method9280(27811);
                            }
                        }
                        @Pc(120) GroundDecor local120 = local16.aGroundDecor_1;
                        if (local120 != null && local120.method9290(0)) {
                            Static453.method6209(local120, local1, local4, local7);
                            local120.method9280(27811);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)V")
    public static void method4625() {
        @Pc(5) int local5 = 0;
        if (ClientOptions.instance != null) {
            local5 = ClientOptions.instance.aClass57_Sub18_1.method5767();
        }
        @Pc(34) int local34;
        @Pc(51) int local51;
        if (local5 == 2) {
            local34 = GameShell.frameWid <= 800 ? GameShell.frameWid : 800;
            GameShell.leftMargin = (GameShell.frameWid - local34) / 2;
            GameShell.canvasWid = local34;
            local51 = GameShell.frameHei <= 600 ? GameShell.frameHei : 600;
            GameShell.topMargin = 0;
            GameShell.canvasHei = local51;
        } else if (local5 == 1) {
            local34 = GameShell.frameWid <= 1024 ? GameShell.frameWid : 1024;
            GameShell.canvasWid = local34;
            local51 = GameShell.frameHei <= 768 ? GameShell.frameHei : 768;
            GameShell.leftMargin = (GameShell.frameWid - local34) / 2;
            GameShell.canvasHei = local51;
            GameShell.topMargin = 0;
        } else {
            GameShell.topMargin = 0;
            GameShell.canvasHei = GameShell.frameHei;
            GameShell.canvasWid = GameShell.frameWid;
            GameShell.leftMargin = 0;
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(IIBIII)I")
    public static int method4626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
        if (Static246.activeGround == null) {
            return 0;
        } else if (arg1 < 3) {
            @Pc(24) int local24 = arg4 >> 9;
            @Pc(28) int local28 = arg0 >> 9;
            if (arg2 < 0 || arg3 < 0 || Static720.mapWidth - 1 < arg2 || Static501.mapHeight - 1 < arg3) {
                return 0;
            } else if (local24 >= 1 && local28 >= 1 && local24 <= Static720.mapWidth - 1 && local28 <= Static501.mapHeight - 1) {
                @Pc(108) boolean local108 = (Static280.tileFlags[1][arg4 >> 9][arg0 >> 9] & 0x2) != 0;
                @Pc(136) boolean local136;
                @Pc(153) boolean local153;
                if ((arg4 & 0x1FF) == 0) {
                    local136 = (Static280.tileFlags[1][local24 - 1][arg0 >> 9] & 0x2) != 0;
                    local153 = (Static280.tileFlags[1][local24][arg0 >> 9] & 0x2) != 0;
                    if (local136 != local153) {
                        local108 = (Static280.tileFlags[1][arg2][arg3] & 0x2) != 0;
                    }
                }
                if ((arg0 & 0x1FF) == 0) {
                    local136 = (Static280.tileFlags[1][arg4 >> 9][local28 - 1] & 0x2) != 0;
                    local153 = (Static280.tileFlags[1][arg4 >> 9][local28] & 0x2) != 0;
                    if (local153 != local136) {
                        local108 = (Static280.tileFlags[1][arg2][arg3] & 0x2) != 0;
                    }
                }
                if (local108) {
                    arg1++;
                }
                return Static246.activeGround[arg1].method7878(arg0, arg4);
            } else {
                return 0;
            }
        } else {
            return Static246.activeGround[arg1].method7878(arg0, arg4);
        }
    }
}
