import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ps")
public final class Class299 {

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "Lclient!cm;")
    public DoublyLinkedNode aClass2_Sub2_48;

    @OriginalMember(owner = "client!ps", name = "e", descriptor = "Lclient!jga;")
    public Queue aQueue_14;

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "()V")
    public Class299() {
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lclient!jga;)V")
    public Class299(@OriginalArg(0) Queue arg0) {
        this.aQueue_14 = arg0;
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(I)Lclient!cm;")
    public DoublyLinkedNode method6723() {
        @Pc(6) DoublyLinkedNode local6 = this.aClass2_Sub2_48;
        if (local6 == this.aQueue_14.tail) {
            this.aClass2_Sub2_48 = null;
            return null;
        } else {
            this.aClass2_Sub2_48 = local6.next2;
            return local6;
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)Lclient!cm;")
    public DoublyLinkedNode method6724() {
        @Pc(14) DoublyLinkedNode local14 = this.aQueue_14.tail.next2;
        if (this.aQueue_14.tail == local14) {
            this.aClass2_Sub2_48 = null;
            return null;
        } else {
            this.aClass2_Sub2_48 = local14.next2;
            return local14;
        }
    }
}
