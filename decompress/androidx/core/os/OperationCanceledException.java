// 
// Decompiled by Procyon v0.6.0
// 

package androidx.core.os;

public class OperationCanceledException extends RuntimeException
{
    public OperationCanceledException() {
        this((String)null);
    }
    
    public OperationCanceledException(String string) {
        if (string != null) {
            string = string.toString();
        }
        else {
            string = "The operation has been canceled.";
        }
        super(string);
    }
}
