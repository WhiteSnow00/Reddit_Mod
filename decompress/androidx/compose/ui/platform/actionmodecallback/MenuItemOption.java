// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform.actionmodecallback;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003�\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003�\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0003�\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00038F�\u0006\u0006\u001a\u0004\b\n\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e�\u0006\u000f" }, d2 = { "Landroidx/compose/ui/platform/actionmodecallback/MenuItemOption;", "", "id", "", "(Ljava/lang/String;II)V", "getId", "()I", "order", "getOrder", "titleResource", "getTitleResource", "Copy", "Paste", "Cut", "SelectAll", "ui_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public enum MenuItemOption
{
    private static final MenuItemOption[] $VALUES;
    
    Copy(0), 
    Cut(2), 
    Paste(1), 
    SelectAll(3);
    
    private final int id;
    private final int order;
    
    private static final MenuItemOption[] $values() {
        return new MenuItemOption[] { MenuItemOption.Copy, MenuItemOption.Paste, MenuItemOption.Cut, MenuItemOption.SelectAll };
    }
    
    static {
        $VALUES = $values();
    }
    
    private MenuItemOption(final int n2) {
        this.id = n2;
        this.order = n2;
    }
    
    public final int getId() {
        return this.id;
    }
    
    public final int getOrder() {
        return this.order;
    }
    
    public final int getTitleResource() {
        final int n = a.a[this.ordinal()];
        int n2;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    n2 = 17039373;
                }
                else {
                    n2 = 17039363;
                }
            }
            else {
                n2 = 17039371;
            }
        }
        else {
            n2 = 17039361;
        }
        return n2;
    }
    
    public final class a
    {
        public static final int[] a;
        
        static {
            final int[] a2 = new int[MenuItemOption.values().length];
            a2[MenuItemOption.Copy.ordinal()] = 1;
            a2[MenuItemOption.Paste.ordinal()] = 2;
            a2[MenuItemOption.Cut.ordinal()] = 3;
            a2[MenuItemOption.SelectAll.ordinal()] = 4;
            a = a2;
        }
    }
}
