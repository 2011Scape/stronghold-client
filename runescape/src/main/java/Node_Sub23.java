import com.jagex.core.datastruct.key.Node;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public final class Node_Sub23 extends Node {

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "[S")
    public final short[] aShortArray59;

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "[B")
    public final byte[] aByteArray38;

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "([S[B)V")
    public Node_Sub23(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
        this.aShortArray59 = arg0;
        this.aByteArray38 = arg1;
    }
}
