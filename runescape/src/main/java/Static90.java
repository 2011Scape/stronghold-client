import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(III)Z")
    public static boolean method1732(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
        return (arg1 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)V")
    public static void method1733() {
        @Pc(17) int[] local17 = Static210.anIntArray280;
        for (@Pc(19) int local19 = 0; local19 < Static338.anInt5564; local19++) {
            @Pc(27) PlayerEntity local27 = PlayerList.highResolutionPlayers[local17[local19]];
            if (local27 != null) {
                local27.method9296();
            }
        }
        for (@Pc(40) int local40 = 0; local40 < NPCList.localNpcCount; local40++) {
            @Pc(49) long local49 = NPCList.localNpcIndices[local40];
            @Pc(57) NPCEntityNode local57 = (NPCEntityNode) NPCList.local.get(local49);
            if (local57 != null) {
                local57.npc.method9296();
            }
        }
        if (CutsceneManager.state != 3) {
            return;
        }
        for (@Pc(78) int local78 = 0; local78 < Static219.aClass236Array1.length; local78++) {
            @Pc(84) Class236 local84 = Static219.aClass236Array1[local78];
            if (local84.aBoolean455) {
                local84.method5363().method9296();
            }
        }
    }
}
