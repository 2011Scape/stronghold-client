import com.jagex.ClientProt;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import rs2.client.clan.channel.ClanChannel;
import rs2.client.clan.channel.ClanChannelUser;

public final class Static525 {

    @OriginalMember(owner = "client!qja", name = "p", descriptor = "I")
    public static int areaCenterZ;

    @OriginalMember(owner = "client!qja", name = "a", descriptor = "(IZI)V")
    public static void method7886(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
        @Pc(17) ClanChannel local17 = arg0 ? Static45.aClass2_Sub47_1 : Static674.aClass2_Sub47_3;
        if (local17 == null || arg1 < 0 || local17.userCount <= arg1) {
            return;
        }
        @Pc(43) ClanChannelUser local43 = local17.users[arg1];
        if (local43.rank != -1) {
            return;
        }
        @Pc(53) String local53 = local43.displayName;
        @Pc(56) ServerConnection local56 = ConnectionManager.active();
        @Pc(62) ClientMessage local62 = ClientMessage.create(ClientProt.CLANCHANNEL_KICKUSER, local56.cipher);
        local62.bitPacket.p1(Static231.method3379(local53) + 3);
        local62.bitPacket.p1(arg0 ? 1 : 0);
        local62.bitPacket.p2(arg1);
        local62.bitPacket.pjstr(local53);
        local56.send(local62);
    }
}
