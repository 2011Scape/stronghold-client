import com.jagex.graphics.Node_Sub7;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bla")
public final class Node_Sub7_Sub1 extends Node_Sub7 {

    @OriginalMember(owner = "client!bla", name = "<init>", descriptor = "(IIIIIF)V")
    public Node_Sub7_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!bla", name = "a", descriptor = "(BF)V")
    @Override
    public void method8433(@OriginalArg(1) float arg0) {
        super.aFloat206 = arg0;
    }

    @OriginalMember(owner = "client!bla", name = "a", descriptor = "(IIII)V")
    @Override
    public void method8427(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
        super.anInt9583 = arg0;
        super.anInt9585 = arg2;
        super.anInt9581 = arg1;
    }
}
