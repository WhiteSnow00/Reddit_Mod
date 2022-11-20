// 
// Decompiled by Procyon v0.6.0
// 

package nb2;

import com.wdullaer.materialdatetimepicker.time.Timepoint;
import s22.e;
import com.reddit.widgets.UpdatingAwardStatView;
import com.wdullaer.materialdatetimepicker.time.TimePickerDialog;
import com.wdullaer.materialdatetimepicker.time.RadialPickerLayout;
import android.view.ViewGroup;

public final class t0 implements Runnable
{
    public final int f;
    public final ViewGroup g;
    public final Object h;
    
    public t0(final ViewGroup g, final int f, final Object h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final void run() {
        switch (this.f) {
            default: {
                final RadialPickerLayout radialPickerLayout = (RadialPickerLayout)this.g;
                final Boolean[] array = (Boolean[])this.h;
                radialPickerLayout.A = true;
                final Timepoint b = radialPickerLayout.b(radialPickerLayout.C, array[0], false);
                radialPickerLayout.h = b;
                radialPickerLayout.d(radialPickerLayout.h = radialPickerLayout.e(radialPickerLayout.getCurrentItemShowing(), b), true, radialPickerLayout.getCurrentItemShowing());
                ((TimePickerDialog)radialPickerLayout.j).y0(radialPickerLayout.h);
                return;
            }
            case 0: {
                UpdatingAwardStatView.p((UpdatingAwardStatView)this.g, (e)this.h);
            }
        }
    }
}
