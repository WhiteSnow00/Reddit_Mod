// 
// Decompiled by Procyon v0.6.0
// 

package td2;

import ng2.e;
import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;

public final class a
{
    public final BluetoothDevice a;
    public final String b;
    public final Integer c;
    
    public a(final BluetoothDevice a) {
        String name = a.getName();
        if (name == null) {
            name = "Bluetooth";
        }
        final BluetoothClass bluetoothClass = a.getBluetoothClass();
        Integer value;
        if (bluetoothClass != null) {
            value = bluetoothClass.getDeviceClass();
        }
        else {
            value = null;
        }
        this.a = a;
        this.b = name;
        this.c = value;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof a) {
                final a a = (a)o;
                if (e.a((Object)this.a, (Object)a.a) && e.a((Object)this.b, (Object)a.b) && e.a((Object)this.c, (Object)a.c)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        final BluetoothDevice a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a != null) {
            hashCode2 = a.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final String b = this.b;
        int hashCode3;
        if (b != null) {
            hashCode3 = b.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final Integer c = this.c;
        if (c != null) {
            hashCode = c.hashCode();
        }
        return (hashCode2 * 31 + hashCode3) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("BluetoothDeviceWrapperImpl(device=");
        t.append(this.a);
        t.append(", name=");
        t.append(this.b);
        t.append(", deviceClass=");
        t.append(this.c);
        t.append(")");
        return t.toString();
    }
}
