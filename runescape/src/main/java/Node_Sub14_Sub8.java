import com.jagex.core.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public final class Node_Sub14_Sub8 extends Node_Sub14 {

    @OriginalMember(owner = "client!mca", name = "o", descriptor = "I")
    public int anInt6079 = -1;

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(Lclient!hi;I)V")
    @Override
    public void method8617(@OriginalArg(0) Class164 arg0) {
        arg0.method3485(this.anInt6079);
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(ILclient!ge;)V")
    @Override
    public void method8615(@OriginalArg(1) Packet arg0) {
        this.anInt6079 = arg0.g2();
    }
}
