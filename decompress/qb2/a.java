// 
// Decompiled by Procyon v0.6.0
// 

package qb2;

import androidx.fragment.app.n;
import java.text.SimpleDateFormat;
import ng2.e;
import com.reddit.widgets.livepill.LabeledButtonView;
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog;
import com.wdullaer.materialdatetimepicker.time.TimePickerDialog;
import android.view.View;
import android.view.View$OnClickListener;

public final class a implements View$OnClickListener
{
    public final int f;
    public final Object g;
    
    public a(final Object g, final int f) {
        this.f = f;
        this.g = g;
    }
    
    public final void onClick(final View view) {
        switch (this.f) {
            default: {
                final TimePickerDialog timePickerDialog = (TimePickerDialog)this.g;
                final int h0 = TimePickerDialog.h0;
                timePickerDialog.H0();
                if (((n)timePickerDialog).getDialog() != null) {
                    ((n)timePickerDialog).getDialog().cancel();
                }
                return;
            }
            case 1: {
                final DatePickerDialog datePickerDialog = (DatePickerDialog)this.g;
                final SimpleDateFormat u = DatePickerDialog.U;
                if (datePickerDialog.y) {
                    datePickerDialog.O.b();
                }
                if (((n)datePickerDialog).getDialog() != null) {
                    ((n)datePickerDialog).getDialog().cancel();
                }
                return;
            }
            case 0: {
                final LabeledButtonView labeledButtonView = (LabeledButtonView)this.g;
                final int g = LabeledButtonView.g;
                e.f((Object)labeledButtonView, "this$0");
                ((View)labeledButtonView).callOnClick();
            }
        }
    }
}
