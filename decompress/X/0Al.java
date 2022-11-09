// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class 0al
{
    @c(LIZ = "method")
    public int LIZ;
    @c(LIZ = "seq_id")
    public int LIZIZ;
    @c(LIZ = "timestemp")
    public long LIZJ;
    @c(LIZ = "init_data")
    public 0ad LIZLLL;
    @c(LIZ = "config_data")
    public 0aZ LJ;
    @c(LIZ = "upload_data")
    public 0an LJFF;
    @c(LIZ = "upload_ack_data")
    public 0am LJI;
    @c(LIZ = "download_data")
    public 0ab LJII;
    @c(LIZ = "download_ack_data")
    public 0aa LJIIIIZZ;
    @c(LIZ = "report_data")
    public 0ai LJIIIZ;
    @c(LIZ = "report_ack_data")
    public 0ah LJIIJ;
    @c(LIZ = "client_error")
    public 0aY LJIIJJI;
    @c(LIZ = "server_error")
    public 0aj LJIIL;
    @c(LIZ = "ping_data")
    public 0ae LJIILIIL;
    @c(LIZ = "pong_data")
    public 0af LJIILJJIL;
    @c(LIZ = "real_time_data")
    public 0ag LJIILL;
    
    static {
        Covode.recordClassIndex(5546);
    }
    
    public 0al() {
        this.LIZ = a.Unknown.getValue();
        this.LIZJ = System.currentTimeMillis();
    }
    
    public 0al(final 0ac 0ac) {
        CTM.LIZ((Object)0ac);
        this();
        this.LIZIZ = 0ac.LJ();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        if (this.LIZLLL != null) {
            final StringBuilder sb2 = new StringBuilder(", initData=");
            sb2.append(this.LIZLLL);
            sb.append(sb2.toString());
        }
        if (this.LJ != null) {
            final StringBuilder sb3 = new StringBuilder(", configData=");
            sb3.append(this.LJ);
            sb.append(sb3.toString());
        }
        final 0an ljff = this.LJFF;
        if (ljff != null) {
            sb.append(", uploadData=".concat(String.valueOf(ljff)));
        }
        if (this.LJI != null) {
            final StringBuilder sb4 = new StringBuilder(", uploadAckData=");
            sb4.append(this.LJI);
            sb.append(sb4.toString());
        }
        if (this.LJII != null) {
            final StringBuilder sb5 = new StringBuilder(", downloadData=");
            sb5.append(this.LJII);
            sb.append(sb5.toString());
        }
        if (this.LJIIIIZZ != null) {
            final StringBuilder sb6 = new StringBuilder(", downloadAckData=");
            sb6.append(this.LJIIIIZZ);
            sb.append(sb6.toString());
        }
        if (this.LJIIIZ != null) {
            final StringBuilder sb7 = new StringBuilder(", reportData=");
            sb7.append(this.LJIIIZ);
            sb.append(sb7.toString());
        }
        if (this.LJIIJ != null) {
            final StringBuilder sb8 = new StringBuilder(", reportAckData=");
            sb8.append(this.LJIIJ);
            sb.append(sb8.toString());
        }
        if (this.LJIIJJI != null) {
            final StringBuilder sb9 = new StringBuilder(", clientErrorData=");
            sb9.append(this.LJIIJJI);
            sb.append(sb9.toString());
        }
        if (this.LJIIL != null) {
            final StringBuilder sb10 = new StringBuilder(", serverErrorData=");
            sb10.append(this.LJIIL);
            sb.append(sb10.toString());
        }
        if (this.LJIILIIL != null) {
            final StringBuilder sb11 = new StringBuilder(", pingData=");
            sb11.append(this.LJIILIIL);
            sb.append(sb11.toString());
        }
        if (this.LJIILJJIL != null) {
            final StringBuilder sb12 = new StringBuilder(", pongData=");
            sb12.append(this.LJIILJJIL);
            sb.append(sb12.toString());
        }
        final StringBuilder sb13 = new StringBuilder("SpeedData(methodType=");
        sb13.append(this.LIZ);
        sb13.append(", seqId=");
        sb13.append(this.LIZIZ);
        sb13.append(", timeStamp=");
        sb13.append(this.LIZJ);
        sb13.append((Object)sb);
        sb13.append(')');
        return sb13.toString();
    }
    
    public enum a
    {
        ClientError(8), 
        Close(13), 
        Config(1), 
        Download(4), 
        DownloadAck(5), 
        Init(0), 
        Ping(10), 
        Pong(11), 
        RealTime(12), 
        Report(6), 
        ReportACK(7), 
        ServerError(9), 
        Unknown(Integer.MIN_VALUE), 
        Upload(2), 
        UploadAck(3);
        
        public final int LIZIZ;
        
        static {
            Covode.recordClassIndex(5547);
        }
        
        public a(final int liziz) {
            this.LIZIZ = liziz;
        }
        
        public final int getValue() {
            return this.LIZIZ;
        }
    }
}
