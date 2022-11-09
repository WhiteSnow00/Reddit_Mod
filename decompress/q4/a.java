// 
// Decompiled by Procyon v0.6.0
// 

package q4;

import java.io.FilterOutputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.EOFException;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import java.util.regex.Matcher;
import java.nio.ByteBuffer;
import java.util.zip.CRC32;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedInputStream;
import androidx.appcompat.widget.s0;
import java.util.Iterator;
import java.util.Map;
import ak0.n;
import android.util.Pair;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.Closeable;
import android.system.Os;
import android.system.OsConstants;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;
import java.io.File;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Collection;
import java.util.Arrays;
import android.util.Log;
import java.nio.ByteOrder;
import android.content.res.AssetManager$AssetInputStream;
import java.io.FileDescriptor;
import java.util.List;
import java.util.regex.Pattern;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.HashMap;

public final class a
{
    public static final byte[] A;
    public static final byte[] B;
    public static final byte[] C;
    public static final byte[] D;
    public static final byte[] E;
    public static final byte[] F;
    public static final byte[] G;
    public static final byte[] H;
    public static final byte[] I;
    public static final byte[] J;
    public static final byte[] K;
    public static final byte[] L;
    public static final byte[] M;
    public static final byte[] N;
    public static final byte[] O;
    public static final byte[] P;
    public static final String[] Q;
    public static final int[] R;
    public static final byte[] S;
    public static final e T;
    public static final e[][] U;
    public static final e[] V;
    public static final e W;
    public static final e X;
    public static final HashMap<Integer, e>[] Y;
    public static final HashMap<String, e>[] Z;
    public static final HashSet<String> a0;
    public static final HashMap<Integer, Integer> b0;
    public static final Charset c0;
    public static final byte[] d0;
    public static final byte[] e0;
    public static final Pattern f0;
    public static final Pattern g0;
    public static final Pattern h0;
    public static final boolean s;
    public static final List<Integer> t;
    public static final List<Integer> u;
    public static final int[] v;
    public static final int[] w;
    public static final byte[] x;
    public static final byte[] y;
    public static final byte[] z;
    public String a;
    public FileDescriptor b;
    public AssetManager$AssetInputStream c;
    public int d;
    public final HashMap<String, d>[] e;
    public HashSet f;
    public ByteOrder g;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    public byte[] l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    
    static {
        final Integer value = 3;
        s = Log.isLoggable("ExifInterface", 3);
        final Integer value2 = 1;
        final Integer value3 = 2;
        final Integer value4 = 8;
        t = Arrays.asList(value2, 6, value, value4);
        final Integer value5 = 7;
        final Integer value6 = 5;
        u = Arrays.asList(value3, value5, 4, value6);
        v = new int[] { 8, 8, 8 };
        w = new int[] { 8 };
        x = new byte[] { -1, -40, -1 };
        y = new byte[] { 102, 116, 121, 112 };
        z = new byte[] { 109, 105, 102, 49 };
        A = new byte[] { 104, 101, 105, 99 };
        B = new byte[] { 79, 76, 89, 77, 80, 0 };
        C = new byte[] { 79, 76, 89, 77, 80, 85, 83, 0, 73, 73 };
        D = new byte[] { -119, 80, 78, 71, 13, 10, 26, 10 };
        E = new byte[] { 101, 88, 73, 102 };
        F = new byte[] { 73, 72, 68, 82 };
        G = new byte[] { 73, 69, 78, 68 };
        H = new byte[] { 82, 73, 70, 70 };
        I = new byte[] { 87, 69, 66, 80 };
        J = new byte[] { 69, 88, 73, 70 };
        K = new byte[] { -99, 1, 42 };
        L = "VP8X".getBytes(Charset.defaultCharset());
        M = "VP8L".getBytes(Charset.defaultCharset());
        N = "VP8 ".getBytes(Charset.defaultCharset());
        O = "ANIM".getBytes(Charset.defaultCharset());
        P = "ANMF".getBytes(Charset.defaultCharset());
        Q = new String[] { "", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD" };
        R = new int[] { 0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1 };
        S = new byte[] { 65, 83, 67, 73, 73, 0, 0, 0 };
        final e[] array = { new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ImageWidth", 256, 3, 4), new e("ImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("Orientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("SensorTopBorder", 4, 4), new e("SensorLeftBorder", 5, 4), new e("SensorBottomBorder", 6, 4), new e("SensorRightBorder", 7, 4), new e("ISO", 23, 3), new e("JpgFromRaw", 46, 7), new e("Xmp", 700, 1) };
        final e e = new e("ExposureTime", 33434, 5);
        final e e2 = new e("FNumber", 33437, 5);
        final e e3 = new e("ExposureProgram", 34850, 3);
        final e e4 = new e("SpectralSensitivity", 34852, 2);
        final e e5 = new e("PhotographicSensitivity", 34855, 3);
        final e e6 = new e("OECF", 34856, 7);
        final e e7 = new e("SensitivityType", 34864, 3);
        final e e8 = new e("StandardOutputSensitivity", 34865, 4);
        final e e9 = new e("RecommendedExposureIndex", 34866, 4);
        final e e10 = new e("ISOSpeed", 34867, 4);
        final e e11 = new e("ISOSpeedLatitudeyyy", 34868, 4);
        final e e12 = new e("ISOSpeedLatitudezzz", 34869, 4);
        final e e13 = new e("ExifVersion", 36864, 2);
        final e e14 = new e("DateTimeOriginal", 36867, 2);
        final e e15 = new e("DateTimeDigitized", 36868, 2);
        final e e16 = new e("OffsetTime", 36880, 2);
        final e e17 = new e("OffsetTimeOriginal", 36881, 2);
        final e e18 = new e("OffsetTimeDigitized", 36882, 2);
        final e e19 = new e("ComponentsConfiguration", 37121, 7);
        final e e20 = new e("CompressedBitsPerPixel", 37122, 5);
        final e e21 = new e("ShutterSpeedValue", 37377, 10);
        final e e22 = new e("ApertureValue", 37378, 5);
        final e e23 = new e("BrightnessValue", 37379, 10);
        final e e24 = new e("ExposureBiasValue", 37380, 10);
        final e e25 = new e("MaxApertureValue", 37381, 5);
        final e e26 = new e("SubjectDistance", 37382, 5);
        final e e27 = new e("MeteringMode", 37383, 3);
        final e e28 = new e("LightSource", 37384, 3);
        final e e29 = new e("Flash", 37385, 3);
        final e e30 = new e("FocalLength", 37386, 5);
        final e e31 = new e("SubjectArea", 37396, 3);
        final e e32 = new e("MakerNote", 37500, 7);
        final e e33 = new e("UserComment", 37510, 7);
        final e e34 = new e("SubSecTime", 37520, 2);
        final e e35 = new e("SubSecTimeOriginal", 37521, 2);
        final e e36 = new e("SubSecTimeDigitized", 37522, 2);
        final e e37 = new e("FlashpixVersion", 40960, 7);
        final e e38 = new e("ColorSpace", 40961, 3);
        final e e39 = new e("PixelXDimension", 40962, 3, 4);
        final e e40 = new e("PixelYDimension", 40963, 3, 4);
        final e e41 = new e("RelatedSoundFile", 40964, 2);
        final e e42 = new e("InteroperabilityIFDPointer", 40965, 4);
        final e e43 = new e("FlashEnergy", 41483, 5);
        final e e44 = new e("SpatialFrequencyResponse", 41484, 7);
        final e e45 = new e("FocalPlaneXResolution", 41486, 5);
        final e e46 = new e("FocalPlaneYResolution", 41487, 5);
        final e e47 = new e("FocalPlaneResolutionUnit", 41488, 3);
        final e e48 = new e("SubjectLocation", 41492, 3);
        final e e49 = new e("ExposureIndex", 41493, 5);
        final e e50 = new e("SensingMethod", 41495, 3);
        final e e51 = new e("FileSource", 41728, 7);
        final e e52 = new e("SceneType", 41729, 7);
        final e e53 = new e("CFAPattern", 41730, 7);
        final e e54 = new e("CustomRendered", 41985, 3);
        final e e55 = new e("ExposureMode", 41986, 3);
        final e e56 = new e("WhiteBalance", 41987, 3);
        final e e57 = new e("DigitalZoomRatio", 41988, 5);
        final e e58 = new e("FocalLengthIn35mmFilm", 41989, 3);
        final e e59 = new e("SceneCaptureType", 41990, 3);
        final e e60 = new e("GainControl", 41991, 3);
        final e e61 = new e("Contrast", 41992, 3);
        final e e62 = new e("Saturation", 41993, 3);
        final e e63 = new e("Sharpness", 41994, 3);
        final e e64 = new e("DeviceSettingDescription", 41995, 7);
        final e e65 = new e("SubjectDistanceRange", 41996, 3);
        final e e66 = new e("ImageUniqueID", 42016, 2);
        final e e67 = new e("CameraOwnerName", 42032, 2);
        final e e68 = new e("BodySerialNumber", 42033, 2);
        final e e69 = new e("LensSpecification", 42034, 5);
        final e e70 = new e("LensMake", 42035, 2);
        final e e71 = new e("LensModel", 42036, 2);
        final e e72 = new e("Gamma", 42240, 5);
        final e e73 = new e("DNGVersion", 50706, 1);
        final e e74 = new e("DefaultCropSize", 50720, 3, 4);
        final e e75 = new e("GPSVersionID", 0, 1);
        final e e76 = new e("GPSLatitudeRef", 1, 2);
        final e e77 = new e("GPSLatitude", 2, 5, 10);
        final e e78 = new e("GPSLongitudeRef", 3, 2);
        final e e79 = new e("GPSLongitude", 4, 5, 10);
        final e e80 = new e("GPSAltitudeRef", 5, 1);
        final e e81 = new e("GPSAltitude", 6, 5);
        final e e82 = new e("GPSTimeStamp", 7, 5);
        final e e83 = new e("GPSSatellites", 8, 2);
        final e e84 = new e("GPSStatus", 9, 2);
        final e e85 = new e("GPSMeasureMode", 10, 2);
        final e e86 = new e("GPSDOP", 11, 5);
        final e e87 = new e("GPSSpeedRef", 12, 2);
        final e e88 = new e("GPSSpeed", 13, 5);
        final e e89 = new e("GPSTrackRef", 14, 2);
        final e e90 = new e("GPSTrack", 15, 5);
        final e e91 = new e("GPSImgDirectionRef", 16, 2);
        final e e92 = new e("GPSImgDirection", 17, 5);
        final e e93 = new e("GPSMapDatum", 18, 2);
        final e e94 = new e("GPSDestLatitudeRef", 19, 2);
        final e e95 = new e("GPSDestLatitude", 20, 5);
        final e e96 = new e("GPSDestLongitudeRef", 21, 2);
        final e e97 = new e("GPSDestLongitude", 22, 5);
        final e e98 = new e("GPSDestBearingRef", 23, 2);
        final e e99 = new e("GPSDestBearing", 24, 5);
        final e e100 = new e("GPSDestDistanceRef", 25, 2);
        final e e101 = new e("GPSDestDistance", 26, 5);
        final e e102 = new e("GPSProcessingMethod", 27, 7);
        final e e103 = new e("GPSAreaInformation", 28, 7);
        final e e104 = new e("GPSDateStamp", 29, 2);
        final e e105 = new e("GPSDifferential", 30, 3);
        final e e106 = new e("GPSHPositioningError", 31, 5);
        final e e107 = new e("InteroperabilityIndex", 1, 2);
        final e e108 = new e("NewSubfileType", 254, 4);
        final e e109 = new e("SubfileType", 255, 4);
        final e e110 = new e("ThumbnailImageWidth", 256, 3, 4);
        final e e111 = new e("ThumbnailImageLength", 257, 3, 4);
        final e e112 = new e("BitsPerSample", 258, 3);
        final e e113 = new e("Compression", 259, 3);
        final e e114 = new e("PhotometricInterpretation", 262, 3);
        final e e115 = new e("ImageDescription", 270, 2);
        final e e116 = new e("Make", 271, 2);
        final e e117 = new e("Model", 272, 2);
        final e e118 = new e("StripOffsets", 273, 3, 4);
        final e e119 = new e("ThumbnailOrientation", 274, 3);
        final e e120 = new e("SamplesPerPixel", 277, 3);
        final e e121 = new e("RowsPerStrip", 278, 3, 4);
        final e e122 = new e("StripByteCounts", 279, 3, 4);
        final e e123 = new e("XResolution", 282, 5);
        final e e124 = new e("YResolution", 283, 5);
        final e e125 = new e("PlanarConfiguration", 284, 3);
        final e e126 = new e("ResolutionUnit", 296, 3);
        final e e127 = new e("TransferFunction", 301, 3);
        final e e128 = new e("Software", 305, 2);
        final e e129 = new e("DateTime", 306, 2);
        final e e130 = new e("Artist", 315, 2);
        final e e131 = new e("WhitePoint", 318, 5);
        final e e132 = new e("PrimaryChromaticities", 319, 5);
        final e e133 = new e("SubIFDPointer", 330, 4);
        final e e134 = new e("JPEGInterchangeFormat", 513, 4);
        final e e135 = new e("JPEGInterchangeFormatLength", 514, 4);
        final e e136 = new e("YCbCrCoefficients", 529, 5);
        final e e137 = new e("YCbCrSubSampling", 530, 3);
        final e e138 = new e("YCbCrPositioning", 531, 3);
        final e e139 = new e("ReferenceBlackWhite", 532, 5);
        final e e140 = new e("Copyright", 33432, 2);
        final e e141 = new e("ExifIFDPointer", 34665, 4);
        final e e142 = new e("GPSInfoIFDPointer", 34853, 4);
        final e e143 = new e("DNGVersion", 50706, 1);
        final e e144 = new e("DefaultCropSize", 50720, 3, 4);
        T = new e("StripOffsets", 273, 3);
        U = new e[][] { array, { e, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e20, e21, e22, e23, e24, e25, e26, e27, e28, e29, e30, e31, e32, e33, e34, e35, e36, e37, e38, e39, e40, e41, e42, e43, e44, e45, e46, e47, e48, e49, e50, e51, e52, e53, e54, e55, e56, e57, e58, e59, e60, e61, e62, e63, e64, e65, e66, e67, e68, e69, e70, e71, e72, e73, e74 }, { e75, e76, e77, e78, e79, e80, e81, e82, e83, e84, e85, e86, e87, e88, e89, e90, e91, e92, e93, e94, e95, e96, e97, e98, e99, e100, e101, e102, e103, e104, e105, e106 }, { e107 }, { e108, e109, e110, e111, e112, e113, e114, e115, e116, e117, e118, e119, e120, e121, e122, e123, e124, e125, e126, e127, e128, e129, e130, e131, e132, e133, e134, e135, e136, e137, e138, e139, e140, e141, e142, e143, e144 }, array, { new e("ThumbnailImage", 256, 7), new e("CameraSettingsIFDPointer", 8224, 4), new e("ImageProcessingIFDPointer", 8256, 4) }, { new e("PreviewImageStart", 257, 4), new e("PreviewImageLength", 258, 4) }, { new e("AspectFrame", 4371, 3) }, { new e("ColorSpace", 55, 3) } };
        V = new e[] { new e("SubIFDPointer", 330, 4), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("InteroperabilityIFDPointer", 40965, 4), new e("CameraSettingsIFDPointer", 8224, 1), new e("ImageProcessingIFDPointer", 8256, 1) };
        W = new e("JPEGInterchangeFormat", 513, 4);
        X = new e("JPEGInterchangeFormatLength", 514, 4);
        Y = new HashMap[10];
        Z = new HashMap[10];
        a0 = new HashSet<String>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        b0 = new HashMap<Integer, Integer>();
        final Charset charset = c0 = Charset.forName("US-ASCII");
        d0 = "Exif\u0000\u0000".getBytes(charset);
        e0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charset);
        final Locale us = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", us).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", us).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int n = 0;
        while (true) {
            final e[][] u2 = a.U;
            if (n >= u2.length) {
                break;
            }
            a.Y[n] = new HashMap<Integer, e>();
            a.Z[n] = new HashMap<String, e>();
            for (final e e145 : u2[n]) {
                a.Y[n].put(e145.a, e145);
                a.Z[n].put(e145.b, e145);
            }
            ++n;
        }
        final HashMap<Integer, Integer> b = a.b0;
        final e[] v2 = a.V;
        b.put(v2[0].a, value6);
        b.put(v2[1].a, value2);
        b.put(v2[2].a, value3);
        b.put(v2[3].a, value);
        b.put(v2[4].a, value5);
        b.put(v2[5].a, value4);
        Pattern.compile(".*[1-9].*");
        f0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
        g0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
        h0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    }
    
    public a(final File file) throws IOException {
        final e[][] u = q4.a.U;
        this.e = new HashMap[u.length];
        this.f = new HashSet(u.length);
        this.g = ByteOrder.BIG_ENDIAN;
        this.x(file.getAbsolutePath());
    }
    
    public a(final InputStream inputStream) throws IOException {
        final e[][] u = q4.a.U;
        this.e = new HashMap[u.length];
        this.f = new HashSet(u.length);
        this.g = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.a = null;
            Label_0151: {
                if (inputStream instanceof AssetManager$AssetInputStream) {
                    this.c = (AssetManager$AssetInputStream)inputStream;
                    this.b = null;
                }
                else {
                    if (inputStream instanceof FileInputStream) {
                        final FileInputStream fileInputStream = (FileInputStream)inputStream;
                        final FileDescriptor fd = fileInputStream.getFD();
                        boolean b;
                        try {
                            Os.lseek(fd, 0L, OsConstants.SEEK_CUR);
                            b = true;
                        }
                        catch (final Exception ex) {
                            if (q4.a.s) {
                                Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                            }
                            b = false;
                        }
                        if (b) {
                            this.c = null;
                            this.b = fileInputStream.getFD();
                            break Label_0151;
                        }
                    }
                    this.c = null;
                    this.b = null;
                }
            }
            this.z(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }
    
    public a(final String s) throws IOException {
        final e[][] u = q4.a.U;
        this.e = new HashMap[u.length];
        this.f = new HashSet(u.length);
        this.g = ByteOrder.BIG_ENDIAN;
        if (s != null) {
            this.x(s);
            return;
        }
        throw new NullPointerException("filename cannot be null");
    }
    
    public static ByteOrder C(final b b) throws IOException {
        final short short1 = b.readShort();
        if (short1 == 18761) {
            if (a.s) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (short1 == 19789) {
            if (a.s) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        final StringBuilder k = a.k("Invalid byte order: ");
        k.append(Integer.toHexString(short1));
        throw new IOException(k.toString());
    }
    
    public static String b(final byte[] array) {
        final StringBuilder sb = new StringBuilder(array.length * 2);
        for (int i = 0; i < array.length; ++i) {
            sb.append(String.format("%02x", array[i]));
        }
        return sb.toString();
    }
    
    public static void c(final Closeable closeable) {
        if (closeable == null) {
            goto Label_0016;
        }
        try {
            closeable.close();
            goto Label_0016;
        }
        catch (final RuntimeException ex) {
            throw ex;
        }
        catch (final Exception ex2) {
            goto Label_0016;
        }
    }
    
    public static double d(final String s, final String s2) {
        try {
            final String[] split = s.split(",", -1);
            final String[] split2 = split[0].split("/", -1);
            final double n = Double.parseDouble(split2[0].trim()) / Double.parseDouble(split2[1].trim());
            final String[] split3 = split[1].split("/", -1);
            final double n2 = Double.parseDouble(split3[0].trim()) / Double.parseDouble(split3[1].trim());
            final String[] split4 = split[2].split("/", -1);
            final double n3 = Double.parseDouble(split4[0].trim()) / Double.parseDouble(split4[1].trim()) / 3600.0 + (n2 / 60.0 + n);
            if (s2.equals("S") || s2.equals("W")) {
                return -n3;
            }
            if (!s2.equals("N") && !s2.equals("E")) {
                throw new IllegalArgumentException();
            }
            return n3;
        }
        catch (final NumberFormatException | ArrayIndexOutOfBoundsException ex) {
            throw new IllegalArgumentException();
        }
    }
    
    public static long[] e(final Serializable s) {
        if (s instanceof int[]) {
            final int[] array = (Object)s;
            final long[] array2 = new long[array.length];
            for (int i = 0; i < array.length; ++i) {
                array2[i] = array[i];
            }
            return array2;
        }
        if (s instanceof long[]) {
            return (long[])(Object)s;
        }
        return null;
    }
    
    public static void f(final InputStream inputStream, final OutputStream outputStream) throws IOException {
        final byte[] array = new byte[8192];
        while (true) {
            final int read = inputStream.read(array);
            if (read == -1) {
                break;
            }
            outputStream.write(array, 0, read);
        }
    }
    
    public static void g(final InputStream inputStream, final OutputStream outputStream, int i) throws IOException {
        final byte[] array = new byte[8192];
        while (i > 0) {
            final int min = Math.min(i, 8192);
            final int read = inputStream.read(array, 0, min);
            if (read != min) {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
            i -= read;
            outputStream.write(array, 0, read);
        }
    }
    
    public static void h(final b b, final c c, final byte[] array, final byte[] array2) throws IOException {
        byte[] array3;
        do {
            array3 = new byte[4];
            if (b.read(array3) != 4) {
                final StringBuilder k = a.k("Encountered invalid length while copying WebP chunks up tochunk type ");
                final Charset c2 = a.c0;
                k.append(new String(array, c2));
                String string;
                if (array2 == null) {
                    string = "";
                }
                else {
                    final StringBuilder i = a.k(" or ");
                    i.append(new String(array2, c2));
                    string = i.toString();
                }
                k.append(string);
                throw new IOException(k.toString());
            }
            final int int1 = b.readInt();
            c.write(array3);
            c.h(int1);
            int n = int1;
            if (int1 % 2 == 1) {
                n = int1 + 1;
            }
            g(b, c, n);
        } while (!Arrays.equals(array3, array) && (array2 == null || !Arrays.equals(array3, array2)));
    }
    
    public static Pair<Integer, Integer> v(final String s) {
        final boolean contains = s.contains(",");
        int i = 1;
        final Integer value = 2;
        final Integer value2 = -1;
        if (contains) {
            final String[] split = s.split(",", -1);
            Pair v;
            final Pair<Integer, Integer> pair = (Pair<Integer, Integer>)(v = v(split[0]));
            if ((int)pair.first == 2) {
                return pair;
            }
            while (i < split.length) {
                final Pair<Integer, Integer> v2 = v(split[i]);
                int intValue;
                if (!((Integer)v2.first).equals(v.first) && !((Integer)v2.second).equals(v.first)) {
                    intValue = -1;
                }
                else {
                    intValue = (int)v.first;
                }
                int intValue2;
                if ((int)v.second != -1 && (((Integer)v2.first).equals(v.second) || ((Integer)v2.second).equals(v.second))) {
                    intValue2 = (int)v.second;
                }
                else {
                    intValue2 = -1;
                }
                if (intValue == -1 && intValue2 == -1) {
                    return (Pair<Integer, Integer>)new Pair((Object)value, (Object)value2);
                }
                if (intValue == -1) {
                    v = new Pair((Object)intValue2, (Object)value2);
                }
                else if (intValue2 == -1) {
                    v = new Pair((Object)intValue, (Object)value2);
                }
                ++i;
            }
            return (Pair<Integer, Integer>)v;
        }
        else {
            Label_0422: {
                if (!s.contains("/")) {
                    break Label_0422;
                }
                final String[] split2 = s.split("/", -1);
                Label_0411: {
                    if (split2.length != 2) {
                        break Label_0411;
                    }
                    try {
                        final long n = (long)Double.parseDouble(split2[0]);
                        final long n2 = (long)Double.parseDouble(split2[1]);
                        if (n < 0L || n2 < 0L) {
                            return (Pair<Integer, Integer>)new Pair((Object)10, (Object)value2);
                        }
                        if (n <= 2147483647L && n2 <= 2147483647L) {
                            return (Pair<Integer, Integer>)new Pair((Object)10, (Object)5);
                        }
                        return (Pair<Integer, Integer>)new Pair((Object)5, (Object)value2);
                        try {
                            final Long value3 = Long.parseLong(s);
                            if (value3 >= 0L && value3 <= 65535L) {
                                return (Pair<Integer, Integer>)new Pair((Object)3, (Object)4);
                            }
                            if (value3 < 0L) {
                                return (Pair<Integer, Integer>)new Pair((Object)9, (Object)value2);
                            }
                            return (Pair<Integer, Integer>)new Pair((Object)4, (Object)value2);
                        }
                        catch (final NumberFormatException ex) {
                            try {
                                Double.parseDouble(s);
                                return (Pair<Integer, Integer>)new Pair((Object)12, (Object)value2);
                            }
                            catch (final NumberFormatException ex2) {
                                return (Pair<Integer, Integer>)new Pair((Object)value, (Object)value2);
                            }
                        }
                        return (Pair<Integer, Integer>)new Pair((Object)value, (Object)value2);
                    }
                    catch (final NumberFormatException ex3) {
                        return (Pair<Integer, Integer>)new Pair((Object)value, (Object)value2);
                    }
                }
            }
        }
    }
    
    public final void A(final b b, int n) throws IOException {
        final ByteOrder c = C(b);
        this.g = c;
        b.g = c;
        final int unsignedShort = b.readUnsignedShort();
        final int d = this.d;
        if (d != 7 && d != 10 && unsignedShort != 42) {
            final StringBuilder k = a.k("Invalid start code: ");
            k.append(Integer.toHexString(unsignedShort));
            throw new IOException(k.toString());
        }
        final int int1 = b.readInt();
        if (int1 < 8 || int1 >= n) {
            throw new IOException(n.k("Invalid first Ifd offset: ", int1));
        }
        n = int1 - 8;
        if (n > 0 && b.skipBytes(n) != n) {
            throw new IOException(n.k("Couldn't jump to first Ifd: ", n));
        }
    }
    
    public final void B() {
        for (int i = 0; i < this.e.length; ++i) {
            final StringBuilder p = d.p("The size of tag group[", i, "]: ");
            p.append(this.e[i].size());
            Log.d("ExifInterface", p.toString());
            for (final Map.Entry<K, d> entry : this.e[i].entrySet()) {
                final d d = entry.getValue();
                final StringBuilder k = a.k("tagName: ");
                k.append((String)entry.getKey());
                k.append(", tagType: ");
                k.append(d.toString());
                k.append(", tagValue: '");
                k.append(d.i(this.g));
                k.append("'");
                Log.d("ExifInterface", k.toString());
            }
        }
    }
    
    public final void D(final int n, final byte[] array) throws IOException {
        final b b = new b(array);
        this.A(b, array.length);
        this.E(b, n);
    }
    
    public final void E(final b b, int int1) throws IOException {
        this.f.add(b.i);
        if (b.i + 2 > b.h) {
            return;
        }
        final short short1 = b.readShort();
        final boolean s = q4.a.s;
        final String s2 = "ExifInterface";
        if (s) {
            s0.u("numberOfDirectoryEntry: ", short1, "ExifInterface");
        }
        if (short1 * 12 + b.i <= b.h) {
            if (short1 > 0) {
                short n = 0;
                while (true) {
                    final int n2 = int1;
                    if (n >= short1) {
                        break;
                    }
                    final int unsignedShort = b.readUnsignedShort();
                    final int unsignedShort2 = b.readUnsignedShort();
                    final int int2 = b.readInt();
                    final long n3 = b.i + 4L;
                    final e e = q4.a.Y[n2].get(unsignedShort);
                    final boolean s3 = q4.a.s;
                    if (s3) {
                        String b2;
                        if (e != null) {
                            b2 = e.b;
                        }
                        else {
                            b2 = null;
                        }
                        Log.d(s2, String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", int1, unsignedShort, b2, unsignedShort2, int2));
                    }
                    int n4 = 0;
                    long n5 = 0L;
                    int n6 = 0;
                    Label_0556: {
                        Label_0451: {
                            if (e == null) {
                                if (s3) {
                                    s0.u("Skip the tag entry since tag number is not defined: ", unsignedShort, s2);
                                }
                            }
                            else {
                                if (unsignedShort2 > 0) {
                                    final int[] r = q4.a.R;
                                    if (unsignedShort2 < r.length) {
                                        final int c = e.c;
                                        boolean b3 = false;
                                        Label_0390: {
                                            if (c != 7) {
                                                if (unsignedShort2 != 7) {
                                                    if (c != unsignedShort2) {
                                                        final int d = e.d;
                                                        if (d != unsignedShort2) {
                                                            if ((c != 4 && d != 4) || unsignedShort2 != 3) {
                                                                if ((c != 9 && d != 9) || unsignedShort2 != 8) {
                                                                    if ((c != 12 && d != 12) || unsignedShort2 != 11) {
                                                                        b3 = false;
                                                                        break Label_0390;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            b3 = true;
                                        }
                                        if (!b3) {
                                            if (s3) {
                                                final StringBuilder k = a.k("Skip the tag entry since data format (");
                                                k.append(q4.a.Q[unsignedShort2]);
                                                k.append(") is unexpected for tag: ");
                                                k.append(e.b);
                                                Log.d(s2, k.toString());
                                            }
                                            break Label_0451;
                                        }
                                        else {
                                            if ((n4 = unsignedShort2) == 7) {
                                                n4 = c;
                                            }
                                            n5 = int2 * (long)r[n4];
                                            if (n5 >= 0L && n5 <= 2147483647L) {
                                                n6 = 1;
                                                break Label_0556;
                                            }
                                            if (s3) {
                                                s0.u("Skip the tag entry since the number of components is invalid: ", int2, s2);
                                            }
                                            n6 = 0;
                                            break Label_0556;
                                        }
                                    }
                                }
                                if (s3) {
                                    s0.u("Skip the tag entry since data format is invalid: ", unsignedShort2, s2);
                                }
                            }
                        }
                        final int n7 = 0;
                        n5 = 0L;
                        n4 = unsignedShort2;
                        n6 = n7;
                    }
                    Label_0801: {
                        if (n6 == 0) {
                            b.f(n3);
                        }
                        else {
                            if (n5 > 4L) {
                                final int int3 = b.readInt();
                                if (s3) {
                                    s0.u("seek to data offset: ", int3, s2);
                                }
                                if (this.d == 7) {
                                    if ("MakerNote".equals(e.b)) {
                                        this.o = int3;
                                    }
                                    else if (n2 == 6 && "ThumbnailImage".equals(e.b)) {
                                        this.p = int3;
                                        this.q = int2;
                                        final d e2 = q4.a.d.e(6, this.g);
                                        final d b4 = q4.a.d.b(this.p, this.g);
                                        final d b5 = q4.a.d.b(this.q, this.g);
                                        this.e[4].put("Compression", e2);
                                        this.e[4].put("JPEGInterchangeFormat", b4);
                                        this.e[4].put("JPEGInterchangeFormatLength", b5);
                                    }
                                }
                                final long n8 = int3;
                                if (n8 + n5 > b.h) {
                                    if (s3) {
                                        s0.u("Skip the tag entry since data offset is invalid: ", int3, s2);
                                    }
                                    b.f(n3);
                                    break Label_0801;
                                }
                                b.f(n8);
                            }
                            final Integer n9 = q4.a.b0.get(unsignedShort);
                            if (s3) {
                                final StringBuilder sb = new StringBuilder();
                                sb.append("nextIfdType: ");
                                sb.append(n9);
                                sb.append(" byteCount: ");
                                sb.append(n5);
                                Log.d(s2, sb.toString());
                            }
                            if (n9 != null) {
                                long n10 = -1L;
                                Label_0971: {
                                    int n11;
                                    if (n4 != 3) {
                                        if (n4 == 4) {
                                            n10 = ((long)b.readInt() & 0xFFFFFFFFL);
                                            break Label_0971;
                                        }
                                        if (n4 != 8) {
                                            if (n4 != 9 && n4 != 13) {
                                                break Label_0971;
                                            }
                                            n11 = b.readInt();
                                        }
                                        else {
                                            n11 = b.readShort();
                                        }
                                    }
                                    else {
                                        n11 = b.readUnsignedShort();
                                    }
                                    n10 = n11;
                                }
                                if (s3) {
                                    Log.d(s2, String.format("Offset: %d, tagName: %s", n10, e.b));
                                }
                                if (n10 > 0L && n10 < b.h) {
                                    if (!this.f.contains((int)n10)) {
                                        b.f(n10);
                                        this.E(b, n9);
                                    }
                                    else if (s3) {
                                        final StringBuilder sb2 = new StringBuilder();
                                        sb2.append("Skip jump into the IFD since it has already been read: IfdType ");
                                        sb2.append(n9);
                                        sb2.append(" (at ");
                                        sb2.append(n10);
                                        sb2.append(")");
                                        Log.d(s2, sb2.toString());
                                    }
                                }
                                else if (s3) {
                                    final StringBuilder sb3 = new StringBuilder();
                                    sb3.append("Skip jump into the IFD since its offset is invalid: ");
                                    sb3.append(n10);
                                    Log.d(s2, sb3.toString());
                                }
                                b.f(n3);
                            }
                            else {
                                final int i = b.i;
                                final int n12 = this.n;
                                final byte[] array = new byte[(int)n5];
                                b.readFully(array);
                                final d d2 = new d(i + n12, array, n4, int2);
                                this.e[int1].put(e.b, d2);
                                if ("DNGVersion".equals(e.b)) {
                                    this.d = 3;
                                }
                                if ((("Make".equals(e.b) || "Model".equals(e.b)) && d2.i(this.g).contains("PENTAX")) || ("Compression".equals(e.b) && d2.h(this.g) == 65535)) {
                                    this.d = 8;
                                }
                                if (b.i != n3) {
                                    b.f(n3);
                                }
                            }
                        }
                    }
                    ++n;
                }
                if (b.i + 4 <= b.h) {
                    int1 = b.readInt();
                    final boolean s4 = q4.a.s;
                    if (s4) {
                        Log.d(s2, String.format("nextIfdOffset: %d", int1));
                    }
                    final long n13 = int1;
                    if (n13 > 0L && int1 < b.h) {
                        if (!this.f.contains(int1)) {
                            b.f(n13);
                            if (this.e[4].isEmpty()) {
                                this.E(b, 4);
                            }
                            else if (this.e[5].isEmpty()) {
                                this.E(b, 5);
                            }
                        }
                        else if (s4) {
                            s0.u("Stop reading file since re-reading an IFD may cause an infinite loop: ", int1, s2);
                        }
                    }
                    else if (s4) {
                        s0.u("Stop reading file since a wrong offset may cause an infinite loop: ", int1, s2);
                    }
                }
            }
        }
    }
    
    public final void F(final String s) {
        for (int i = 0; i < q4.a.U.length; ++i) {
            this.e[i].remove(s);
        }
    }
    
    public final void G() throws IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        q4/a.d:I
        //     4: istore_1       
        //     5: iconst_0       
        //     6: istore_2       
        //     7: iconst_0       
        //     8: istore_3       
        //     9: iconst_0       
        //    10: istore          4
        //    12: iconst_0       
        //    13: istore          5
        //    15: iload_1        
        //    16: iconst_4       
        //    17: if_icmpeq       40
        //    20: iload_1        
        //    21: bipush          13
        //    23: if_icmpeq       40
        //    26: iload_1        
        //    27: bipush          14
        //    29: if_icmpne       35
        //    32: goto            40
        //    35: iconst_0       
        //    36: istore_1       
        //    37: goto            42
        //    40: iconst_1       
        //    41: istore_1       
        //    42: iload_1        
        //    43: ifeq            1024
        //    46: aload_0        
        //    47: getfield        q4/a.b:Ljava/io/FileDescriptor;
        //    50: ifnonnull       74
        //    53: aload_0        
        //    54: getfield        q4/a.a:Ljava/lang/String;
        //    57: ifnull          63
        //    60: goto            74
        //    63: new             Ljava/io/IOException;
        //    66: dup            
        //    67: ldc_w           "ExifInterface does not support saving attributes for the current input."
        //    70: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //    73: athrow         
        //    74: aload_0        
        //    75: getfield        q4/a.m:I
        //    78: istore_1       
        //    79: aconst_null    
        //    80: astore          6
        //    82: aconst_null    
        //    83: astore          7
        //    85: aconst_null    
        //    86: astore          8
        //    88: aconst_null    
        //    89: astore          9
        //    91: aconst_null    
        //    92: astore          10
        //    94: aconst_null    
        //    95: astore          11
        //    97: iload_1        
        //    98: bipush          6
        //   100: if_icmpeq       118
        //   103: iload_1        
        //   104: bipush          7
        //   106: if_icmpne       112
        //   109: goto            118
        //   112: aconst_null    
        //   113: astore          12
        //   115: goto            124
        //   118: aload_0        
        //   119: invokevirtual   q4/a.t:()[B
        //   122: astore          12
        //   124: aload_0        
        //   125: aload           12
        //   127: putfield        q4/a.l:[B
        //   130: ldc_w           "temp"
        //   133: ldc_w           "tmp"
        //   136: invokestatic    java/io/File.createTempFile:(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
        //   139: astore          13
        //   141: aload_0        
        //   142: getfield        q4/a.a:Ljava/lang/String;
        //   145: ifnull          165
        //   148: new             Ljava/io/FileInputStream;
        //   151: astore          12
        //   153: aload           12
        //   155: aload_0        
        //   156: getfield        q4/a.a:Ljava/lang/String;
        //   159: invokespecial   java/io/FileInputStream.<init>:(Ljava/lang/String;)V
        //   162: goto            190
        //   165: aload_0        
        //   166: getfield        q4/a.b:Ljava/io/FileDescriptor;
        //   169: lconst_0       
        //   170: getstatic       android/system/OsConstants.SEEK_SET:I
        //   173: invokestatic    android/system/Os.lseek:(Ljava/io/FileDescriptor;JI)J
        //   176: pop2           
        //   177: new             Ljava/io/FileInputStream;
        //   180: dup            
        //   181: aload_0        
        //   182: getfield        q4/a.b:Ljava/io/FileDescriptor;
        //   185: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/FileDescriptor;)V
        //   188: astore          12
        //   190: new             Ljava/io/FileOutputStream;
        //   193: astore          9
        //   195: aload           9
        //   197: aload           13
        //   199: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //   202: aload           12
        //   204: aload           9
        //   206: invokestatic    q4/a.f:(Ljava/io/InputStream;Ljava/io/OutputStream;)V
        //   209: aload           12
        //   211: invokestatic    q4/a.c:(Ljava/io/Closeable;)V
        //   214: aload           9
        //   216: invokestatic    q4/a.c:(Ljava/io/Closeable;)V
        //   219: new             Ljava/io/FileInputStream;
        //   222: astore          8
        //   224: aload           8
        //   226: aload           13
        //   228: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //   231: aload_0        
        //   232: getfield        q4/a.a:Ljava/lang/String;
        //   235: ifnull          255
        //   238: new             Ljava/io/FileOutputStream;
        //   241: astore          12
        //   243: aload           12
        //   245: aload_0        
        //   246: getfield        q4/a.a:Ljava/lang/String;
        //   249: invokespecial   java/io/FileOutputStream.<init>:(Ljava/lang/String;)V
        //   252: goto            280
        //   255: aload_0        
        //   256: getfield        q4/a.b:Ljava/io/FileDescriptor;
        //   259: lconst_0       
        //   260: getstatic       android/system/OsConstants.SEEK_SET:I
        //   263: invokestatic    android/system/Os.lseek:(Ljava/io/FileDescriptor;JI)J
        //   266: pop2           
        //   267: new             Ljava/io/FileOutputStream;
        //   270: dup            
        //   271: aload_0        
        //   272: getfield        q4/a.b:Ljava/io/FileDescriptor;
        //   275: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/FileDescriptor;)V
        //   278: astore          12
        //   280: new             Ljava/io/BufferedInputStream;
        //   283: astore          10
        //   285: aload           10
        //   287: aload           8
        //   289: invokespecial   java/io/BufferedInputStream.<init>:(Ljava/io/InputStream;)V
        //   292: new             Ljava/io/BufferedOutputStream;
        //   295: astore          7
        //   297: aload           7
        //   299: aload           12
        //   301: invokespecial   java/io/BufferedOutputStream.<init>:(Ljava/io/OutputStream;)V
        //   304: iload_2        
        //   305: istore_1       
        //   306: aload           10
        //   308: astore          9
        //   310: aload           7
        //   312: astore          11
        //   314: aload_0        
        //   315: getfield        q4/a.d:I
        //   318: istore_3       
        //   319: iload_3        
        //   320: iconst_4       
        //   321: if_icmpne       345
        //   324: iload_2        
        //   325: istore_1       
        //   326: aload           10
        //   328: astore          9
        //   330: aload           7
        //   332: astore          11
        //   334: aload_0        
        //   335: aload           10
        //   337: aload           7
        //   339: invokevirtual   q4/a.H:(Ljava/io/BufferedInputStream;Ljava/io/BufferedOutputStream;)V
        //   342: goto            396
        //   345: iload_3        
        //   346: bipush          13
        //   348: if_icmpne       372
        //   351: iload_2        
        //   352: istore_1       
        //   353: aload           10
        //   355: astore          9
        //   357: aload           7
        //   359: astore          11
        //   361: aload_0        
        //   362: aload           10
        //   364: aload           7
        //   366: invokevirtual   q4/a.I:(Ljava/io/BufferedInputStream;Ljava/io/BufferedOutputStream;)V
        //   369: goto            396
        //   372: iload_3        
        //   373: bipush          14
        //   375: if_icmpne       396
        //   378: iload_2        
        //   379: istore_1       
        //   380: aload           10
        //   382: astore          9
        //   384: aload           7
        //   386: astore          11
        //   388: aload_0        
        //   389: aload           10
        //   391: aload           7
        //   393: invokevirtual   q4/a.J:(Ljava/io/BufferedInputStream;Ljava/io/BufferedOutputStream;)V
        //   396: aload           10
        //   398: invokestatic    q4/a.c:(Ljava/io/Closeable;)V
        //   401: aload           7
        //   403: invokestatic    q4/a.c:(Ljava/io/Closeable;)V
        //   406: aload           13
        //   408: invokevirtual   java/io/File.delete:()Z
        //   411: pop            
        //   412: aload_0        
        //   413: aconst_null    
        //   414: putfield        q4/a.l:[B
        //   417: return         
        //   418: astore          9
        //   420: aload           10
        //   422: astore          6
        //   424: aload           7
        //   426: astore          10
        //   428: goto            478
        //   431: astore          12
        //   433: aconst_null    
        //   434: astore          11
        //   436: iload_3        
        //   437: istore_1       
        //   438: aload           10
        //   440: astore          9
        //   442: goto            863
        //   445: astore          9
        //   447: aconst_null    
        //   448: astore          11
        //   450: aload           10
        //   452: astore          6
        //   454: aload           11
        //   456: astore          10
        //   458: goto            478
        //   461: astore          9
        //   463: goto            471
        //   466: astore          9
        //   468: aconst_null    
        //   469: astore          12
        //   471: aconst_null    
        //   472: astore          6
        //   474: aload           6
        //   476: astore          10
        //   478: aload           8
        //   480: astore          11
        //   482: aload           9
        //   484: astore          7
        //   486: aload           11
        //   488: astore          9
        //   490: goto            525
        //   493: astore          12
        //   495: aconst_null    
        //   496: astore          11
        //   498: iload           4
        //   500: istore_1       
        //   501: aload           6
        //   503: astore          9
        //   505: goto            863
        //   508: astore          7
        //   510: aconst_null    
        //   511: astore          12
        //   513: aload           12
        //   515: astore          6
        //   517: aload           6
        //   519: astore          10
        //   521: aload           11
        //   523: astore          9
        //   525: new             Ljava/io/FileInputStream;
        //   528: astore          8
        //   530: aload           8
        //   532: aload           13
        //   534: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //   537: aload           12
        //   539: astore          9
        //   541: aload           12
        //   543: astore          11
        //   545: aload_0        
        //   546: getfield        q4/a.a:Ljava/lang/String;
        //   549: ifnonnull       609
        //   552: aload           12
        //   554: astore          9
        //   556: aload           12
        //   558: astore          11
        //   560: aload_0        
        //   561: getfield        q4/a.b:Ljava/io/FileDescriptor;
        //   564: lconst_0       
        //   565: getstatic       android/system/OsConstants.SEEK_SET:I
        //   568: invokestatic    android/system/Os.lseek:(Ljava/io/FileDescriptor;JI)J
        //   571: pop2           
        //   572: aload           12
        //   574: astore          9
        //   576: aload           12
        //   578: astore          11
        //   580: new             Ljava/io/FileOutputStream;
        //   583: astore          14
        //   585: aload           12
        //   587: astore          9
        //   589: aload           12
        //   591: astore          11
        //   593: aload           14
        //   595: aload_0        
        //   596: getfield        q4/a.b:Ljava/io/FileDescriptor;
        //   599: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/FileDescriptor;)V
        //   602: aload           14
        //   604: astore          12
        //   606: goto            630
        //   609: aload           12
        //   611: astore          9
        //   613: aload           12
        //   615: astore          11
        //   617: new             Ljava/io/FileOutputStream;
        //   620: dup            
        //   621: aload_0        
        //   622: getfield        q4/a.a:Ljava/lang/String;
        //   625: invokespecial   java/io/FileOutputStream.<init>:(Ljava/lang/String;)V
        //   628: astore          12
        //   630: aload           12
        //   632: astore          9
        //   634: aload           12
        //   636: astore          11
        //   638: aload           8
        //   640: aload           12
        //   642: invokestatic    q4/a.f:(Ljava/io/InputStream;Ljava/io/OutputStream;)V
        //   645: iload_2        
        //   646: istore_1       
        //   647: aload           6
        //   649: astore          9
        //   651: aload           10
        //   653: astore          11
        //   655: aload           8
        //   657: invokestatic    q4/a.c:(Ljava/io/Closeable;)V
        //   660: iload_2        
        //   661: istore_1       
        //   662: aload           6
        //   664: astore          9
        //   666: aload           10
        //   668: astore          11
        //   670: aload           12
        //   672: invokestatic    q4/a.c:(Ljava/io/Closeable;)V
        //   675: iload_2        
        //   676: istore_1       
        //   677: aload           6
        //   679: astore          9
        //   681: aload           10
        //   683: astore          11
        //   685: new             Ljava/io/IOException;
        //   688: astore          12
        //   690: iload_2        
        //   691: istore_1       
        //   692: aload           6
        //   694: astore          9
        //   696: aload           10
        //   698: astore          11
        //   700: aload           12
        //   702: ldc_w           "Failed to save new file"
        //   705: aload           7
        //   707: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   710: iload_2        
        //   711: istore_1       
        //   712: aload           6
        //   714: astore          9
        //   716: aload           10
        //   718: astore          11
        //   720: aload           12
        //   722: athrow         
        //   723: astore          7
        //   725: aload           9
        //   727: astore          12
        //   729: goto            815
        //   732: astore          7
        //   734: aload           8
        //   736: astore          9
        //   738: aload           11
        //   740: astore          12
        //   742: goto            756
        //   745: astore          7
        //   747: aload           9
        //   749: astore          8
        //   751: goto            815
        //   754: astore          7
        //   756: new             Ljava/io/IOException;
        //   759: astore          11
        //   761: new             Ljava/lang/StringBuilder;
        //   764: astore          8
        //   766: aload           8
        //   768: invokespecial   java/lang/StringBuilder.<init>:()V
        //   771: aload           8
        //   773: ldc_w           "Failed to save new file. Original file is stored in "
        //   776: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   779: pop            
        //   780: aload           8
        //   782: aload           13
        //   784: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   787: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   790: pop            
        //   791: aload           11
        //   793: aload           8
        //   795: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   798: aload           7
        //   800: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   803: aload           11
        //   805: athrow         
        //   806: astore          7
        //   808: iconst_1       
        //   809: istore          5
        //   811: aload           9
        //   813: astore          8
        //   815: iload           5
        //   817: istore_1       
        //   818: aload           6
        //   820: astore          9
        //   822: aload           10
        //   824: astore          11
        //   826: aload           8
        //   828: invokestatic    q4/a.c:(Ljava/io/Closeable;)V
        //   831: iload           5
        //   833: istore_1       
        //   834: aload           6
        //   836: astore          9
        //   838: aload           10
        //   840: astore          11
        //   842: aload           12
        //   844: invokestatic    q4/a.c:(Ljava/io/Closeable;)V
        //   847: iload           5
        //   849: istore_1       
        //   850: aload           6
        //   852: astore          9
        //   854: aload           10
        //   856: astore          11
        //   858: aload           7
        //   860: athrow         
        //   861: astore          12
        //   863: aload           9
        //   865: invokestatic    q4/a.c:(Ljava/io/Closeable;)V
        //   868: aload           11
        //   870: invokestatic    q4/a.c:(Ljava/io/Closeable;)V
        //   873: iload_1        
        //   874: ifne            883
        //   877: aload           13
        //   879: invokevirtual   java/io/File.delete:()Z
        //   882: pop            
        //   883: aload           12
        //   885: athrow         
        //   886: astore          6
        //   888: aload           9
        //   890: astore          10
        //   892: aload           6
        //   894: astore          9
        //   896: goto            918
        //   899: astore          6
        //   901: aload           9
        //   903: astore          10
        //   905: aload           6
        //   907: astore          9
        //   909: goto            943
        //   912: astore          9
        //   914: aload           7
        //   916: astore          10
        //   918: aload           10
        //   920: astore          6
        //   922: aload           12
        //   924: astore          10
        //   926: aload           9
        //   928: astore          12
        //   930: aload           6
        //   932: astore          9
        //   934: goto            1011
        //   937: astore          9
        //   939: aload           8
        //   941: astore          10
        //   943: aload           10
        //   945: astore          11
        //   947: aload           12
        //   949: astore          6
        //   951: aload           9
        //   953: astore          10
        //   955: aload           11
        //   957: astore          12
        //   959: aload           6
        //   961: astore          9
        //   963: goto            979
        //   966: astore          12
        //   968: aconst_null    
        //   969: astore          9
        //   971: goto            1011
        //   974: astore          10
        //   976: aconst_null    
        //   977: astore          12
        //   979: new             Ljava/io/IOException;
        //   982: astore          6
        //   984: aload           6
        //   986: ldc_w           "Failed to copy original file to temp file"
        //   989: aload           10
        //   991: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   994: aload           6
        //   996: athrow         
        //   997: astore          6
        //   999: aload           9
        //  1001: astore          10
        //  1003: aload           12
        //  1005: astore          9
        //  1007: aload           6
        //  1009: astore          12
        //  1011: aload           10
        //  1013: invokestatic    q4/a.c:(Ljava/io/Closeable;)V
        //  1016: aload           9
        //  1018: invokestatic    q4/a.c:(Ljava/io/Closeable;)V
        //  1021: aload           12
        //  1023: athrow         
        //  1024: new             Ljava/io/IOException;
        //  1027: dup            
        //  1028: ldc_w           "ExifInterface only supports saving attributes on JPEG, PNG, or WebP formats."
        //  1031: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //  1034: athrow         
        //    Exceptions:
        //  throws java.io.IOException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  130    162    974    979    Ljava/lang/Exception;
        //  130    162    966    974    Any
        //  165    190    974    979    Ljava/lang/Exception;
        //  165    190    966    974    Any
        //  190    202    937    943    Ljava/lang/Exception;
        //  190    202    912    918    Any
        //  202    209    899    912    Ljava/lang/Exception;
        //  202    209    886    899    Any
        //  219    231    508    525    Ljava/lang/Exception;
        //  219    231    493    508    Any
        //  231    252    466    471    Ljava/lang/Exception;
        //  231    252    493    508    Any
        //  255    280    466    471    Ljava/lang/Exception;
        //  255    280    493    508    Any
        //  280    292    461    466    Ljava/lang/Exception;
        //  280    292    493    508    Any
        //  292    304    445    461    Ljava/lang/Exception;
        //  292    304    431    445    Any
        //  314    319    418    431    Ljava/lang/Exception;
        //  314    319    861    863    Any
        //  334    342    418    431    Ljava/lang/Exception;
        //  334    342    861    863    Any
        //  361    369    418    431    Ljava/lang/Exception;
        //  361    369    861    863    Any
        //  388    396    418    431    Ljava/lang/Exception;
        //  388    396    861    863    Any
        //  525    537    754    756    Ljava/lang/Exception;
        //  525    537    745    754    Any
        //  545    552    732    745    Ljava/lang/Exception;
        //  545    552    723    732    Any
        //  560    572    732    745    Ljava/lang/Exception;
        //  560    572    723    732    Any
        //  580    585    732    745    Ljava/lang/Exception;
        //  580    585    723    732    Any
        //  593    602    732    745    Ljava/lang/Exception;
        //  593    602    723    732    Any
        //  617    630    732    745    Ljava/lang/Exception;
        //  617    630    723    732    Any
        //  638    645    732    745    Ljava/lang/Exception;
        //  638    645    723    732    Any
        //  655    660    861    863    Any
        //  670    675    861    863    Any
        //  685    690    861    863    Any
        //  700    710    861    863    Any
        //  720    723    861    863    Any
        //  756    806    806    815    Any
        //  826    831    861    863    Any
        //  842    847    861    863    Any
        //  858    861    861    863    Any
        //  979    997    997    1011   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.UnsupportedOperationException
        //     at java.util.Collections$1.remove(Unknown Source)
        //     at java.util.AbstractCollection.removeAll(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:3018)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2501)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void H(final BufferedInputStream bufferedInputStream, final BufferedOutputStream bufferedOutputStream) throws IOException {
        if (q4.a.s) {
            final StringBuilder sb = new StringBuilder();
            sb.append("saveJpegAttributes starting with (inputStream: ");
            sb.append(bufferedInputStream);
            sb.append(", outputStream: ");
            sb.append(bufferedOutputStream);
            sb.append(")");
            Log.d("ExifInterface", sb.toString());
        }
        final DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
        final c c = new c(bufferedOutputStream, ByteOrder.BIG_ENDIAN);
        if (dataInputStream.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        c.b(-1);
        if (dataInputStream.readByte() == -40) {
            c.b(-40);
            d d2;
            final d d = d2 = null;
            if (this.i("Xmp") != null) {
                d2 = d;
                if (this.r) {
                    d2 = this.e[0].remove("Xmp");
                }
            }
            c.b(-1);
            c.b(-31);
            this.P(c);
            if (d2 != null) {
                this.e[0].put("Xmp", d2);
            }
            final byte[] array = new byte[4096];
            while (dataInputStream.readByte() == -1) {
                final byte byte1 = dataInputStream.readByte();
                if (byte1 == -39 || byte1 == -38) {
                    c.b(-1);
                    c.b(byte1);
                    f(dataInputStream, c);
                    return;
                }
                if (byte1 != -31) {
                    c.b(-1);
                    c.b(byte1);
                    int i = dataInputStream.readUnsignedShort();
                    c.k((short)i);
                    i -= 2;
                    if (i < 0) {
                        throw new IOException("Invalid length");
                    }
                    while (i > 0) {
                        final int read = dataInputStream.read(array, 0, Math.min(i, 4096));
                        if (read < 0) {
                            break;
                        }
                        c.write(array, 0, read);
                        i -= read;
                    }
                }
                else {
                    final int n = dataInputStream.readUnsignedShort() - 2;
                    if (n < 0) {
                        throw new IOException("Invalid length");
                    }
                    final byte[] array2 = new byte[6];
                    if (n >= 6) {
                        if (dataInputStream.read(array2) != 6) {
                            throw new IOException("Invalid exif");
                        }
                        if (Arrays.equals(array2, q4.a.d0)) {
                            final int n2 = n - 6;
                            if (dataInputStream.skipBytes(n2) == n2) {
                                continue;
                            }
                            throw new IOException("Invalid length");
                        }
                    }
                    c.b(-1);
                    c.b(byte1);
                    c.k((short)(n + 2));
                    int j;
                    if ((j = n) >= 6) {
                        j = n - 6;
                        c.write(array2);
                    }
                    while (j > 0) {
                        final int read2 = dataInputStream.read(array, 0, Math.min(j, 4096));
                        if (read2 < 0) {
                            break;
                        }
                        c.write(array, 0, read2);
                        j -= read2;
                    }
                }
            }
            throw new IOException("Invalid marker");
        }
        throw new IOException("Invalid marker");
    }
    
    public final void I(final BufferedInputStream bufferedInputStream, final BufferedOutputStream bufferedOutputStream) throws IOException {
        if (q4.a.s) {
            final StringBuilder sb = new StringBuilder();
            sb.append("savePngAttributes starting with (inputStream: ");
            sb.append(bufferedInputStream);
            sb.append(", outputStream: ");
            sb.append(bufferedOutputStream);
            sb.append(")");
            Log.d("ExifInterface", sb.toString());
        }
        final DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
        final ByteOrder big_ENDIAN = ByteOrder.BIG_ENDIAN;
        final c c = new c(bufferedOutputStream, big_ENDIAN);
        final byte[] d = q4.a.D;
        g(dataInputStream, c, d.length);
        final int n = this.n;
        if (n == 0) {
            final int int1 = dataInputStream.readInt();
            c.h(int1);
            g(dataInputStream, c, int1 + 4 + 4);
        }
        else {
            g(dataInputStream, c, n - d.length - 4 - 4);
            dataInputStream.skipBytes(dataInputStream.readInt() + 4 + 4);
        }
        Object byteArray = null;
        byte[] array;
        try {
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArray = new c(byteArrayOutputStream, big_ENDIAN);
                this.P((c)byteArray);
                byteArray = ((ByteArrayOutputStream)((c)byteArray).f).toByteArray();
                c.write((byte[])byteArray);
                final CRC32 crc32 = new CRC32();
                crc32.update((byte[])byteArray, 4, ((byte[])byteArray).length - 4);
                c.h((int)crc32.getValue());
                c(byteArrayOutputStream);
                f(dataInputStream, c);
                return;
            }
            finally {}
        }
        finally {
            array = (byte[])byteArray;
        }
        c((Closeable)(Object)array);
    }
    
    public final void J(final BufferedInputStream bufferedInputStream, BufferedOutputStream ex) throws IOException {
        Object o = null;
        if (q4.a.s) {
            o = new StringBuilder();
            ((StringBuilder)o).append("saveWebpAttributes starting with (inputStream: ");
            ((StringBuilder)o).append(bufferedInputStream);
            ((StringBuilder)o).append(", outputStream: ");
            ((StringBuilder)o).append(ex);
            ((StringBuilder)o).append(")");
            Log.d("ExifInterface", ((StringBuilder)o).toString());
        }
        final ByteOrder little_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        final b b = new b(bufferedInputStream, little_ENDIAN);
        final c c = new c((OutputStream)ex, little_ENDIAN);
        final byte[] h = q4.a.H;
        g(b, c, h.length);
        final byte[] i = q4.a.I;
        b.skipBytes(i.length + 4);
        byte[] array = null;
        Object l = ex = null;
        try {
            try {
                o = new(java.io.ByteArrayOutputStream.class)();
                ex = (Exception)l;
                new ByteArrayOutputStream();
                try {
                    ex = (Exception)new c((OutputStream)o, little_ENDIAN);
                    final int n = this.n;
                    if (n != 0) {
                        g(b, (OutputStream)ex, n - (h.length + 4 + i.length) - 4 - 4);
                        b.skipBytes(4);
                        b.skipBytes(b.readInt());
                        this.P((c)ex);
                        goto Label_0909;
                    }
                    array = new byte[4];
                    if (b.read(array) != 4) {
                        goto Label_0952;
                    }
                    l = q4.a.L;
                    final boolean equals = Arrays.equals(array, (byte[])l);
                    final int n2 = 0;
                    if (!equals) {
                        goto Label_0460;
                    }
                    final int int1 = b.readInt();
                    int n3;
                    if (int1 % 2 == 1) {
                        n3 = int1 + 1;
                    }
                    else {
                        n3 = int1;
                    }
                    array = new byte[n3];
                    b.read(array);
                    final byte b2 = (byte)(0x8 | array[0]);
                    array[0] = b2;
                    int n4 = n2;
                    if ((b2 >> 1 & 0x1) == 0x1) {
                        n4 = 1;
                    }
                    ((c)ex).write((byte[])l);
                    ((c)ex).h(int1);
                    ((c)ex).write(array);
                    if (n4 != 0) {
                        h(b, (c)ex, q4.a.O, null);
                        while (true) {
                            array = new byte[4];
                            bufferedInputStream.read(array);
                            if (!Arrays.equals(array, q4.a.P)) {
                                break;
                            }
                            final int int2 = b.readInt();
                            ((c)ex).write(array);
                            ((c)ex).h(int2);
                            int n5 = int2;
                            if (int2 % 2 == 1) {
                                n5 = int2 + 1;
                            }
                            g(b, (OutputStream)ex, n5);
                        }
                        this.P((c)ex);
                        goto Label_0909;
                    }
                    goto Label_0440;
                }
                catch (final Exception ex) {
                    o = ex;
                }
            }
            finally {}
        }
        catch (final Exception o) {}
        throw new IOException("Failed to save WebP file", (Throwable)o);
        o = ex;
        c((Closeable)o);
    }
    
    public final void K(String replaceAll, String s) {
        final String s2 = replaceAll;
        final String s3 = s;
        final boolean equals = "DateTime".equals(s2);
        final String s4 = "ExifInterface";
        Label_0173: {
            if (!equals && !"DateTimeOriginal".equals(s2)) {
                replaceAll = s3;
                if (!"DateTimeDigitized".equals(s2)) {
                    break Label_0173;
                }
            }
            if ((replaceAll = s3) != null) {
                final boolean find = q4.a.g0.matcher(s3).find();
                final boolean find2 = q4.a.h0.matcher(s3).find();
                if (s.length() != 19 || (!find && !find2)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Invalid value for ");
                    sb.append(s2);
                    sb.append(" : ");
                    sb.append(s3);
                    Log.w("ExifInterface", sb.toString());
                    return;
                }
                replaceAll = s3;
                if (find2) {
                    replaceAll = s3.replaceAll("-", ":");
                }
            }
        }
        String s5 = s2;
        if ("ISOSpeedRatings".equals(s2)) {
            if (q4.a.s) {
                Log.d("ExifInterface", "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            s5 = "PhotographicSensitivity";
        }
        int n = 1;
        if ((s = replaceAll) != null) {
            s = replaceAll;
            if (q4.a.a0.contains(s5)) {
                if (s5.equals("GPSTimeStamp")) {
                    final Matcher matcher = q4.a.f0.matcher(replaceAll);
                    if (!matcher.find()) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Invalid value for ");
                        sb2.append(s5);
                        sb2.append(" : ");
                        sb2.append(replaceAll);
                        Log.w("ExifInterface", sb2.toString());
                        return;
                    }
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append(Integer.parseInt(matcher.group(1)));
                    sb3.append("/1,");
                    sb3.append(Integer.parseInt(matcher.group(2)));
                    sb3.append("/1,");
                    sb3.append(Integer.parseInt(matcher.group(3)));
                    sb3.append("/1");
                    s = sb3.toString();
                }
                else {
                    try {
                        s = new f((long)(Double.parseDouble(replaceAll) * 10000.0), 10000L).toString();
                    }
                    catch (final NumberFormatException ex) {
                        final StringBuilder sb4 = new StringBuilder();
                        sb4.append("Invalid value for ");
                        sb4.append(s5);
                        sb4.append(" : ");
                        sb4.append(replaceAll);
                        Log.w("ExifInterface", sb4.toString());
                        return;
                    }
                }
            }
        }
        int i = 0;
        int j = 0;
        replaceAll = s4;
        while (i < q4.a.U.length) {
            Label_1831: {
                if (i != 4 || this.h) {
                    final e e = q4.a.Z[i].get(s5);
                    if (e != null) {
                        if (s == null) {
                            this.e[i].remove(s5);
                        }
                        else {
                            final Pair<Integer, Integer> v = v(s);
                            int n2;
                            if (e.c != (int)v.first && e.c != (int)v.second) {
                                final int d = e.d;
                                if (d != -1 && (d == (int)v.first || e.d == (int)v.second)) {
                                    n2 = e.d;
                                }
                                else {
                                    n2 = e.c;
                                    if (n2 != n && n2 != 7 && n2 != 2) {
                                        if (q4.a.s) {
                                            final StringBuilder l = b.l("Given tag (", s5, ") value didn't match with one of expected formats: ");
                                            final String[] q = q4.a.Q;
                                            l.append(q[e.c]);
                                            final int d2 = e.d;
                                            final String s6 = "";
                                            String string;
                                            if (d2 == -1) {
                                                string = "";
                                            }
                                            else {
                                                final StringBuilder k = a.k(", ");
                                                k.append(q[e.d]);
                                                string = k.toString();
                                            }
                                            l.append(string);
                                            l.append(" (guess: ");
                                            l.append(q[(int)v.first]);
                                            String string2;
                                            if ((int)v.second == -1) {
                                                string2 = s6;
                                            }
                                            else {
                                                final StringBuilder m = a.k(", ");
                                                m.append(q[(int)v.second]);
                                                string2 = m.toString();
                                            }
                                            l.append(string2);
                                            l.append(")");
                                            Log.d(replaceAll, l.toString());
                                        }
                                        break Label_1831;
                                    }
                                }
                            }
                            else {
                                n2 = e.c;
                            }
                            int n3 = 0;
                            int n4 = 0;
                            Label_1820: {
                                switch (n2) {
                                    default: {
                                        n3 = j;
                                        n4 = n;
                                        if (q4.a.s) {
                                            s0.u("Data format isn't one of expected formats: ", n2, replaceAll);
                                            break Label_1831;
                                        }
                                        break Label_1820;
                                    }
                                    case 12: {
                                        final String[] split = s.split(",", -1);
                                        final int length = split.length;
                                        final double[] array = new double[length];
                                        for (int n5 = j; n5 < split.length; ++n5) {
                                            array[n5] = Double.parseDouble(split[n5]);
                                        }
                                        final HashMap<String, d> hashMap = this.e[i];
                                        final ByteOrder g = this.g;
                                        final ByteBuffer wrap = ByteBuffer.wrap(new byte[q4.a.R[12] * length]);
                                        wrap.order(g);
                                        for (int n6 = j; n6 < length; ++n6) {
                                            wrap.putDouble(array[n6]);
                                        }
                                        hashMap.put(s5, new d(12, length, wrap.array()));
                                        break Label_1831;
                                    }
                                    case 10: {
                                        final String[] split2 = s.split(",", -1);
                                        final int length2 = split2.length;
                                        final f[] array2 = new f[length2];
                                        int n7 = j;
                                        while (j < split2.length) {
                                            final String[] split3 = split2[j].split("/", -1);
                                            array2[j] = new f((long)Double.parseDouble(split3[n7]), (long)Double.parseDouble(split3[n]));
                                            ++j;
                                            n7 = 0;
                                            n = 1;
                                        }
                                        final HashMap<String, d> hashMap2 = this.e[i];
                                        final ByteOrder g2 = this.g;
                                        final ByteBuffer wrap2 = ByteBuffer.wrap(new byte[q4.a.R[10] * length2]);
                                        wrap2.order(g2);
                                        for (final f f : array2) {
                                            wrap2.putInt((int)f.a);
                                            wrap2.putInt((int)f.b);
                                        }
                                        hashMap2.put(s5, new d(10, length2, wrap2.array()));
                                        break;
                                    }
                                    case 9: {
                                        final String[] split4 = s.split(",", -1);
                                        final int length3 = split4.length;
                                        final int[] array3 = new int[length3];
                                        for (int n9 = 0; n9 < split4.length; ++n9) {
                                            array3[n9] = Integer.parseInt(split4[n9]);
                                        }
                                        final HashMap<String, d> hashMap3 = this.e[i];
                                        final ByteOrder g3 = this.g;
                                        final ByteBuffer wrap3 = ByteBuffer.wrap(new byte[q4.a.R[9] * length3]);
                                        wrap3.order(g3);
                                        for (int n10 = 0; n10 < length3; ++n10) {
                                            wrap3.putInt(array3[n10]);
                                        }
                                        hashMap3.put(s5, new d(9, length3, wrap3.array()));
                                        break;
                                    }
                                    case 5: {
                                        final String[] split5 = s.split(",", -1);
                                        final f[] array4 = new f[split5.length];
                                        for (int n11 = 0; n11 < split5.length; ++n11) {
                                            final String[] split6 = split5[n11].split("/", -1);
                                            array4[n11] = new f((long)Double.parseDouble(split6[0]), (long)Double.parseDouble(split6[1]));
                                        }
                                        this.e[i].put(s5, q4.a.d.d(array4, this.g));
                                        break;
                                    }
                                    case 4: {
                                        final String[] split7 = s.split(",", -1);
                                        final long[] array5 = new long[split7.length];
                                        for (int n12 = 0; n12 < split7.length; ++n12) {
                                            array5[n12] = Long.parseLong(split7[n12]);
                                        }
                                        this.e[i].put(s5, q4.a.d.c(array5, this.g));
                                        break;
                                    }
                                    case 3: {
                                        final String[] split8 = s.split(",", -1);
                                        final int[] array6 = new int[split8.length];
                                        for (int n13 = 0; n13 < split8.length; ++n13) {
                                            array6[n13] = Integer.parseInt(split8[n13]);
                                        }
                                        this.e[i].put(s5, q4.a.d.f(array6, this.g));
                                        break;
                                    }
                                    case 2:
                                    case 7: {
                                        this.e[i].put(s5, q4.a.d.a(s));
                                        break;
                                    }
                                    case 1: {
                                        final HashMap<String, d> hashMap4 = this.e[i];
                                        d d3;
                                        if (s.length() == 1 && s.charAt(0) >= '0' && s.charAt(0) <= '1') {
                                            d3 = new d(1, 1, new byte[] { (byte)(s.charAt(0) - '0') });
                                        }
                                        else {
                                            final byte[] bytes = s.getBytes(q4.a.c0);
                                            d3 = new d(1, bytes.length, bytes);
                                        }
                                        n3 = 0;
                                        hashMap4.put(s5, d3);
                                        n4 = 1;
                                        break Label_1820;
                                    }
                                }
                                n = 1;
                                j = 0;
                                break Label_1831;
                            }
                            j = n3;
                            n = n4;
                        }
                    }
                }
            }
            ++i;
        }
    }
    
    public final void L(final b b) throws IOException {
        final HashMap<String, d> hashMap = this.e[4];
        final d d = hashMap.get("Compression");
        if (d != null) {
            final int h = d.h(this.g);
            if ((this.m = h) != 1) {
                if (h == 6) {
                    this.w(b, hashMap);
                    return;
                }
                if (h != 7) {
                    return;
                }
            }
            final d d2 = hashMap.get("BitsPerSample");
            boolean b2 = false;
            Label_0207: {
                Label_0189: {
                    if (d2 != null) {
                        final int[] array = (Object)d2.j(this.g);
                        final int[] v = q4.a.v;
                        if (!Arrays.equals(v, array)) {
                            if (this.d != 3) {
                                break Label_0189;
                            }
                            final d d3 = hashMap.get("PhotometricInterpretation");
                            if (d3 == null) {
                                break Label_0189;
                            }
                            final int h2 = d3.h(this.g);
                            if ((h2 != 1 || !Arrays.equals(array, q4.a.w)) && (h2 != 6 || !Arrays.equals(array, v))) {
                                break Label_0189;
                            }
                        }
                        b2 = true;
                        break Label_0207;
                    }
                }
                if (q4.a.s) {
                    Log.d("ExifInterface", "Unsupported data type value");
                }
                b2 = false;
            }
            if (b2) {
                final d d4 = hashMap.get("StripOffsets");
                final d d5 = hashMap.get("StripByteCounts");
                if (d4 != null && d5 != null) {
                    final long[] e = e(d4.j(this.g));
                    final long[] e2 = e(d5.j(this.g));
                    if (e != null && e.length != 0) {
                        if (e2 != null && e2.length != 0) {
                            if (e.length != e2.length) {
                                Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                            }
                            else {
                                long n = 0L;
                                for (int length = e2.length, i = 0; i < length; ++i) {
                                    n += e2[i];
                                }
                                final int k = (int)n;
                                final byte[] l = new byte[k];
                                this.i = true;
                                this.h = true;
                                final int n2 = 0;
                                int n4;
                                int n3 = n4 = n2;
                                for (int j = n2; j < e.length; ++j) {
                                    final int n5 = (int)e[j];
                                    final int n6 = (int)e2[j];
                                    if (j < e.length - 1 && n5 + n6 != e[j + 1]) {
                                        this.i = false;
                                    }
                                    final int n7 = n5 - n4;
                                    if (n7 < 0) {
                                        Log.d("ExifInterface", "Invalid strip offset value");
                                        return;
                                    }
                                    final long n8 = n7;
                                    if (b.skip(n8) != n8) {
                                        final StringBuilder sb = new StringBuilder();
                                        sb.append("Failed to skip ");
                                        sb.append(n7);
                                        sb.append(" bytes.");
                                        Log.d("ExifInterface", sb.toString());
                                        return;
                                    }
                                    final byte[] array2 = new byte[n6];
                                    if (b.read(array2) != n6) {
                                        final StringBuilder sb2 = new StringBuilder();
                                        sb2.append("Failed to read ");
                                        sb2.append(n6);
                                        sb2.append(" bytes.");
                                        Log.d("ExifInterface", sb2.toString());
                                        return;
                                    }
                                    n4 = n4 + n7 + n6;
                                    System.arraycopy(array2, 0, l, n3, n6);
                                    n3 += n6;
                                }
                                this.l = l;
                                if (this.i) {
                                    this.j = (int)e[0];
                                    this.k = k;
                                }
                            }
                        }
                        else {
                            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                        }
                    }
                    else {
                        Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    }
                }
            }
        }
        else {
            this.m = 6;
            this.w(b, hashMap);
        }
    }
    
    public final void M(final int n, final int n2) throws IOException {
        if (!this.e[n].isEmpty() && !this.e[n2].isEmpty()) {
            final d d = this.e[n].get("ImageLength");
            final d d2 = this.e[n].get("ImageWidth");
            final d d3 = this.e[n2].get("ImageLength");
            final d d4 = this.e[n2].get("ImageWidth");
            if (d != null && d2 != null) {
                if (d3 != null && d4 != null) {
                    final int h = d.h(this.g);
                    final int h2 = d2.h(this.g);
                    final int h3 = d3.h(this.g);
                    final int h4 = d4.h(this.g);
                    if (h < h3 && h2 < h4) {
                        final HashMap<String, d>[] e = this.e;
                        final HashMap<String, d> hashMap = e[n];
                        e[n] = e[n2];
                        e[n2] = hashMap;
                    }
                }
                else if (q4.a.s) {
                    Log.d("ExifInterface", "Second image does not contain valid size information");
                }
            }
            else if (q4.a.s) {
                Log.d("ExifInterface", "First image does not contain valid size information");
            }
            return;
        }
        if (q4.a.s) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }
    
    public final void N(final b b, final int n) throws IOException {
        final d d = this.e[n].get("DefaultCropSize");
        final d d2 = this.e[n].get("SensorTopBorder");
        final d d3 = this.e[n].get("SensorLeftBorder");
        final d d4 = this.e[n].get("SensorBottomBorder");
        final d d5 = this.e[n].get("SensorRightBorder");
        if (d != null) {
            d d6;
            d d7;
            if (d.a == 5) {
                final f[] array = (Object)d.j(this.g);
                if (array == null || array.length != 2) {
                    final StringBuilder k = a.k("Invalid crop size values. cropSize=");
                    k.append(Arrays.toString(array));
                    Log.w("ExifInterface", k.toString());
                    return;
                }
                d6 = q4.a.d.d(new f[] { array[0] }, this.g);
                d7 = q4.a.d.d(new f[] { array[1] }, this.g);
            }
            else {
                final int[] array2 = (Object)d.j(this.g);
                if (array2 == null || array2.length != 2) {
                    final StringBuilder i = a.k("Invalid crop size values. cropSize=");
                    i.append(Arrays.toString(array2));
                    Log.w("ExifInterface", i.toString());
                    return;
                }
                d6 = q4.a.d.e(array2[0], this.g);
                d7 = q4.a.d.e(array2[1], this.g);
            }
            this.e[n].put("ImageWidth", d6);
            this.e[n].put("ImageLength", d7);
        }
        else if (d2 != null && d3 != null && d4 != null && d5 != null) {
            final int h = d2.h(this.g);
            final int h2 = d4.h(this.g);
            final int h3 = d5.h(this.g);
            final int h4 = d3.h(this.g);
            if (h2 > h && h3 > h4) {
                final d e = q4.a.d.e(h2 - h, this.g);
                final d e2 = q4.a.d.e(h3 - h4, this.g);
                this.e[n].put("ImageLength", e);
                this.e[n].put("ImageWidth", e2);
            }
        }
        else {
            final d d8 = this.e[n].get("ImageLength");
            final d d9 = this.e[n].get("ImageWidth");
            if (d8 == null || d9 == null) {
                final d d10 = this.e[n].get("JPEGInterchangeFormat");
                final d d11 = this.e[n].get("JPEGInterchangeFormatLength");
                if (d10 != null && d11 != null) {
                    final int h5 = d10.h(this.g);
                    final int h6 = d10.h(this.g);
                    b.f(h5);
                    final byte[] array3 = new byte[h6];
                    b.read(array3);
                    this.m(new b(array3), h5, n);
                }
            }
        }
    }
    
    public final void O() throws IOException {
        this.M(0, 5);
        this.M(0, 4);
        this.M(5, 4);
        final d d = this.e[1].get("PixelXDimension");
        final d d2 = this.e[1].get("PixelYDimension");
        if (d != null && d2 != null) {
            this.e[0].put("ImageWidth", d);
            this.e[0].put("ImageLength", d2);
        }
        if (this.e[4].isEmpty() && this.y(this.e[5])) {
            final HashMap<String, d>[] e = this.e;
            e[4] = e[5];
            e[5] = new HashMap<String, d>();
        }
        if (!this.y(this.e[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
    }
    
    public final void P(final c c) throws IOException {
        final e[][] u = q4.a.U;
        final int[] array = new int[u.length];
        final int[] array2 = new int[u.length];
        final e[] v = q4.a.V;
        for (int length = v.length, i = 0; i < length; ++i) {
            this.F(v[i].b);
        }
        this.F(q4.a.W.b);
        this.F(q4.a.X.b);
        for (int j = 0; j < q4.a.U.length; ++j) {
            final Object[] array3 = this.e[j].entrySet().toArray();
            for (int length2 = array3.length, k = 0; k < length2; ++k) {
                final Map.Entry entry = (Map.Entry)array3[k];
                if (entry.getValue() == null) {
                    this.e[j].remove(entry.getKey());
                }
            }
        }
        if (!this.e[1].isEmpty()) {
            this.e[0].put(q4.a.V[1].b, q4.a.d.b(0L, this.g));
        }
        if (!this.e[2].isEmpty()) {
            this.e[0].put(q4.a.V[2].b, q4.a.d.b(0L, this.g));
        }
        if (!this.e[3].isEmpty()) {
            this.e[1].put(q4.a.V[3].b, q4.a.d.b(0L, this.g));
        }
        if (this.h) {
            this.e[4].put(q4.a.W.b, q4.a.d.b(0L, this.g));
            this.e[4].put(q4.a.X.b, q4.a.d.b(this.k, this.g));
        }
        for (int l = 0; l < q4.a.U.length; ++l) {
            final Iterator<Map.Entry<String, d>> iterator = this.e[l].entrySet().iterator();
            int n = 0;
            while (iterator.hasNext()) {
                final d d = ((Map.Entry<K, d>)iterator.next()).getValue();
                d.getClass();
                final int n2 = q4.a.R[d.a] * d.b;
                int n3 = n;
                if (n2 > 4) {
                    n3 = n + n2;
                }
                n = n3;
            }
            array2[l] += n;
        }
        int m = 8;
        int n5;
        for (int n4 = 0; n4 < q4.a.U.length; ++n4, m = n5) {
            n5 = m;
            if (!this.e[n4].isEmpty()) {
                array[n4] = m;
                n5 = this.e[n4].size() * 12 + 2 + 4 + array2[n4] + m;
            }
        }
        int n6 = m;
        if (this.h) {
            this.e[4].put(q4.a.W.b, q4.a.d.b(m, this.g));
            this.j = m;
            n6 = m + this.k;
        }
        int n7 = n6;
        if (this.d == 4) {
            n7 = n6 + 8;
        }
        if (q4.a.s) {
            for (int n8 = 0; n8 < q4.a.U.length; ++n8) {
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", n8, array[n8], this.e[n8].size(), array2[n8], n7));
            }
        }
        if (!this.e[1].isEmpty()) {
            this.e[0].put(q4.a.V[1].b, q4.a.d.b(array[1], this.g));
        }
        if (!this.e[2].isEmpty()) {
            this.e[0].put(q4.a.V[2].b, q4.a.d.b(array[2], this.g));
        }
        if (!this.e[3].isEmpty()) {
            this.e[1].put(q4.a.V[3].b, q4.a.d.b(array[3], this.g));
        }
        final int d2 = this.d;
        if (d2 != 4) {
            if (d2 != 13) {
                if (d2 == 14) {
                    c.write(q4.a.J);
                    c.h(n7);
                }
            }
            else {
                c.h(n7);
                c.write(q4.a.E);
            }
        }
        else {
            c.k((short)n7);
            c.write(q4.a.d0);
        }
        short n9;
        if (this.g == ByteOrder.BIG_ENDIAN) {
            n9 = 19789;
        }
        else {
            n9 = 18761;
        }
        c.k(n9);
        c.g = this.g;
        c.k((short)42);
        c.h((int)8L);
        for (int n10 = 0; n10 < q4.a.U.length; ++n10) {
            if (!this.e[n10].isEmpty()) {
                c.k((short)this.e[n10].size());
                int n11 = this.e[n10].size() * 12 + (array[n10] + 2) + 4;
                for (final Map.Entry<Object, V> entry2 : this.e[n10].entrySet()) {
                    final int a = q4.a.Z[n10].get(entry2.getKey()).a;
                    final d d3 = (d)entry2.getValue();
                    d3.getClass();
                    int n12 = q4.a.R[d3.a] * d3.b;
                    c.k((short)a);
                    c.k((short)d3.a);
                    c.h(d3.b);
                    if (n12 > 4) {
                        c.h(n11);
                        n11 += n12;
                    }
                    else {
                        c.write(d3.d);
                        if (n12 >= 4) {
                            continue;
                        }
                        while (n12 < 4) {
                            c.b(0);
                            ++n12;
                        }
                    }
                }
                if (n10 == 0 && !this.e[4].isEmpty()) {
                    c.h(array[4]);
                }
                else {
                    c.h((int)0L);
                }
                final Iterator<Map.Entry<String, d>> iterator3 = this.e[n10].entrySet().iterator();
                while (iterator3.hasNext()) {
                    final byte[] d4 = ((Map.Entry<K, d>)iterator3.next()).getValue().d;
                    if (d4.length > 4) {
                        c.write(d4, 0, d4.length);
                    }
                }
            }
        }
        if (this.h) {
            c.write(this.t());
        }
        if (this.d == 14 && n7 % 2 == 1) {
            c.b(0);
        }
        c.g = ByteOrder.BIG_ENDIAN;
    }
    
    public final void a() {
        final String i = this.i("DateTimeOriginal");
        if (i != null && this.i("DateTime") == null) {
            this.e[0].put("DateTime", q4.a.d.a(i));
        }
        if (this.i("ImageWidth") == null) {
            this.e[0].put("ImageWidth", q4.a.d.b(0L, this.g));
        }
        if (this.i("ImageLength") == null) {
            this.e[0].put("ImageLength", q4.a.d.b(0L, this.g));
        }
        if (this.i("Orientation") == null) {
            this.e[0].put("Orientation", q4.a.d.b(0L, this.g));
        }
        if (this.i("LightSource") == null) {
            this.e[1].put("LightSource", q4.a.d.b(0L, this.g));
        }
    }
    
    public final String i(String string) {
        Label_0239: {
            if (string == null) {
                break Label_0239;
            }
            final d k = this.k(string);
            Label_0237: {
                if (k == null) {
                    break Label_0237;
                }
                if (!q4.a.a0.contains(string)) {
                    return k.i(this.g);
                }
                if (string.equals("GPSTimeStamp")) {
                    final int a = k.a;
                    if (a != 5 && a != 10) {
                        final StringBuilder i = a.k("GPS Timestamp format is not rational. format=");
                        i.append(k.a);
                        Log.w("ExifInterface", i.toString());
                        return null;
                    }
                    final f[] array = (Object)k.j(this.g);
                    if (array != null && array.length == 3) {
                        final f f = array[0];
                        final int n = (int)(f.a / (float)f.b);
                        final f f2 = array[1];
                        final int n2 = (int)(f2.a / (float)f2.b);
                        final f f3 = array[2];
                        return String.format("%02d:%02d:%02d", n, n2, (int)(f3.a / (float)f3.b));
                    }
                    final StringBuilder j = a.k("Invalid GPS Timestamp array. array=");
                    j.append(Arrays.toString(array));
                    Log.w("ExifInterface", j.toString());
                    return null;
                }
                try {
                    string = Double.toString(k.g(this.g));
                    return string;
                    return null;
                    throw new NullPointerException("tag shouldn't be null");
                }
                catch (final NumberFormatException ex) {
                    return null;
                }
            }
        }
    }
    
    public final int j(int h, final String s) {
        final d k = this.k(s);
        if (k == null) {
            return h;
        }
        try {
            h = k.h(this.g);
            return h;
        }
        catch (final NumberFormatException ex) {
            return h;
        }
    }
    
    public final d k(final String s) {
        if (s != null) {
            String s2 = s;
            if ("ISOSpeedRatings".equals(s)) {
                if (q4.a.s) {
                    Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
                }
                s2 = "PhotographicSensitivity";
            }
            for (int i = 0; i < q4.a.U.length; ++i) {
                final d d = this.e[i].get(s2);
                if (d != null) {
                    return d;
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }
    
    public final void l(final b b) throws IOException {
        final MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource((MediaDataSource)new MediaDataSource() {
                public long f;
                
                public final void close() throws IOException {
                }
                
                public final long getSize() throws IOException {
                    return -1L;
                }
                
                public final int readAt(final long f, final byte[] array, int read, final int n) throws IOException {
                    if (n == 0) {
                        return 0;
                    }
                    if (f < 0L) {
                        return -1;
                    }
                    while (true) {
                        try {
                            final long f2 = this.f;
                            if (f2 != f) {
                                if (f2 >= 0L && f >= f2 + b.available()) {
                                    return -1;
                                }
                                b.f(f);
                                this.f = f;
                            }
                            int available;
                            if ((available = n) > b.available()) {
                                available = b.available();
                            }
                            read = b.read(array, read, available);
                            if (read >= 0) {
                                this.f += read;
                                return read;
                            }
                            this.f = -1L;
                            return -1;
                        }
                        catch (final IOException ex) {
                            continue;
                        }
                        break;
                    }
                }
            });
            final String metadata = mediaMetadataRetriever.extractMetadata(33);
            final String metadata2 = mediaMetadataRetriever.extractMetadata(34);
            final String metadata3 = mediaMetadataRetriever.extractMetadata(26);
            final String metadata4 = mediaMetadataRetriever.extractMetadata(17);
            final boolean equals = "yes".equals(metadata3);
            String s = null;
            String s2;
            String s3;
            if (equals) {
                s = mediaMetadataRetriever.extractMetadata(29);
                s2 = mediaMetadataRetriever.extractMetadata(30);
                s3 = mediaMetadataRetriever.extractMetadata(31);
            }
            else if ("yes".equals(metadata4)) {
                s = mediaMetadataRetriever.extractMetadata(18);
                s2 = mediaMetadataRetriever.extractMetadata(19);
                s3 = mediaMetadataRetriever.extractMetadata(24);
            }
            else {
                s2 = (s3 = null);
            }
            if (s != null) {
                this.e[0].put("ImageWidth", q4.a.d.e(Integer.parseInt(s), this.g));
            }
            if (s2 != null) {
                this.e[0].put("ImageLength", q4.a.d.e(Integer.parseInt(s2), this.g));
            }
            if (s3 != null) {
                int n = 1;
                final int int1 = Integer.parseInt(s3);
                if (int1 != 90) {
                    if (int1 != 180) {
                        if (int1 == 270) {
                            n = 8;
                        }
                    }
                    else {
                        n = 3;
                    }
                }
                else {
                    n = 6;
                }
                this.e[0].put("Orientation", q4.a.d.e(n, this.g));
            }
            if (metadata != null && metadata2 != null) {
                final int int2 = Integer.parseInt(metadata);
                int int3 = Integer.parseInt(metadata2);
                if (int3 <= 6) {
                    throw new IOException("Invalid exif length");
                }
                b.f(int2);
                final byte[] array = new byte[6];
                if (b.read(array) != 6) {
                    throw new IOException("Can't read identifier");
                }
                int3 -= 6;
                if (!Arrays.equals(array, q4.a.d0)) {
                    throw new IOException("Invalid identifier");
                }
                final byte[] array2 = new byte[int3];
                if (b.read(array2) != int3) {
                    throw new IOException("Can't read exif");
                }
                this.n = int2 + 6;
                this.D(0, array2);
            }
            if (q4.a.s) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Heif meta: ");
                sb.append(s);
                sb.append("x");
                sb.append(s2);
                sb.append(", rotation ");
                sb.append(s3);
                Log.d("ExifInterface", sb.toString());
            }
        }
        finally {
            mediaMetadataRetriever.release();
        }
    }
    
    public final void m(final b b, final int n, final int n2) throws IOException {
        if (q4.a.s) {
            final StringBuilder sb = new StringBuilder();
            sb.append("getJpegAttributes starting with: ");
            sb.append(b);
            Log.d("ExifInterface", sb.toString());
        }
        b.mark(0);
        b.g = ByteOrder.BIG_ENDIAN;
        final byte byte1 = b.readByte();
        if (byte1 != -1) {
            final StringBuilder k = a.k("Invalid marker: ");
            k.append(Integer.toHexString(byte1 & 0xFF));
            throw new IOException(k.toString());
        }
        if (b.readByte() != -40) {
            final StringBuilder i = a.k("Invalid marker: ");
            i.append(Integer.toHexString(byte1 & 0xFF));
            throw new IOException(i.toString());
        }
        int n3 = 2;
        while (true) {
            final int n4 = 0;
            final byte byte2 = b.readByte();
            if (byte2 != -1) {
                final StringBuilder j = a.k("Invalid marker:");
                j.append(Integer.toHexString(byte2 & 0xFF));
                throw new IOException(j.toString());
            }
            final byte byte3 = b.readByte();
            final boolean s = q4.a.s;
            if (s) {
                final StringBuilder l = a.k("Found JPEG segment indicator: ");
                l.append(Integer.toHexString(byte3 & 0xFF));
                Log.d("ExifInterface", l.toString());
            }
            if (byte3 == -39 || byte3 == -38) {
                b.g = this.g;
                return;
            }
            final int n5 = b.readUnsignedShort() - 2;
            final int n6 = n3 + 1 + 1 + 2;
            if (s) {
                final StringBuilder m = a.k("JPEG segment: ");
                m.append(Integer.toHexString(byte3 & 0xFF));
                m.append(" (length: ");
                m.append(n5 + 2);
                m.append(")");
                Log.d("ExifInterface", m.toString());
            }
            if (n5 < 0) {
                throw new IOException("Invalid length");
            }
            int n7 = 0;
            int n8 = 0;
            Label_0836: {
                if (byte3 != -31) {
                    if (byte3 != -2) {
                        switch (byte3) {
                            default:
                                Label_0391: {
                                    switch (byte3) {
                                        default: {
                                            switch (byte3) {
                                                default: {
                                                    switch (byte3) {
                                                        default: {
                                                            n7 = n5;
                                                            n8 = n6;
                                                            break Label_0836;
                                                        }
                                                        case -51:
                                                        case -50:
                                                        case -49: {
                                                            break Label_0391;
                                                        }
                                                    }
                                                    break;
                                                }
                                                case -55:
                                                case -54:
                                                case -53: {
                                                    break Label_0391;
                                                }
                                            }
                                            break;
                                        }
                                        case -59:
                                        case -58:
                                        case -57: {
                                            break Label_0391;
                                        }
                                    }
                                    break;
                                }
                            case -64:
                            case -63:
                            case -62:
                            case -61: {
                                if (b.skipBytes(1) == 1) {
                                    this.e[n2].put("ImageLength", q4.a.d.b(b.readUnsignedShort(), this.g));
                                    this.e[n2].put("ImageWidth", q4.a.d.b(b.readUnsignedShort(), this.g));
                                    n7 = n5 - 5;
                                    n8 = n6;
                                    break;
                                }
                                throw new IOException("Invalid SOFx");
                            }
                        }
                    }
                    else {
                        final byte[] array = new byte[n5];
                        if (b.read(array) != n5) {
                            throw new IOException("Invalid exif");
                        }
                        n7 = n4;
                        n8 = n6;
                        if (this.i("UserComment") == null) {
                            this.e[1].put("UserComment", q4.a.d.a(new String(array, q4.a.c0)));
                            n7 = n4;
                            n8 = n6;
                        }
                    }
                }
                else {
                    final byte[] array2 = new byte[n5];
                    b.readFully(array2);
                    final byte[] d0 = q4.a.d0;
                    boolean b2 = false;
                    Label_0634: {
                        Label_0619: {
                            if (d0 != null) {
                                if (n5 >= d0.length) {
                                    for (int n9 = 0; n9 < d0.length; ++n9) {
                                        if (array2[n9] != d0[n9]) {
                                            break Label_0619;
                                        }
                                    }
                                    b2 = true;
                                    break Label_0634;
                                }
                            }
                        }
                        b2 = false;
                    }
                    if (b2) {
                        final byte[] copyOfRange = Arrays.copyOfRange(array2, d0.length, n5);
                        this.n = n + n6 + d0.length;
                        this.D(n2, copyOfRange);
                        this.L(new b(copyOfRange));
                    }
                    else {
                        final byte[] e0 = q4.a.e0;
                        boolean b3 = false;
                        Label_0749: {
                            Label_0734: {
                                if (e0 != null) {
                                    if (n5 >= e0.length) {
                                        for (int n10 = 0; n10 < e0.length; ++n10) {
                                            if (array2[n10] != e0[n10]) {
                                                break Label_0734;
                                            }
                                        }
                                        b3 = true;
                                        break Label_0749;
                                    }
                                }
                            }
                            b3 = false;
                        }
                        if (b3) {
                            final int length = e0.length;
                            final byte[] copyOfRange2 = Arrays.copyOfRange(array2, e0.length, n5);
                            if (this.i("Xmp") == null) {
                                this.e[0].put("Xmp", new d(n6 + length, copyOfRange2, 1, copyOfRange2.length));
                                this.r = true;
                            }
                        }
                    }
                    n7 = 0;
                    n8 = n6 + n5;
                }
            }
            if (n7 < 0) {
                throw new IOException("Invalid length");
            }
            if (b.skipBytes(n7) != n7) {
                throw new IOException("Invalid JPEG segment");
            }
            n3 = n8 + n7;
        }
    }
    
    public final int n(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        final byte[] array = new byte[5000];
        bufferedInputStream.read(array);
        bufferedInputStream.reset();
        int n = 0;
        boolean b;
        while (true) {
            final byte[] x = q4.a.x;
            if (n >= x.length) {
                b = true;
                break;
            }
            if (array[n] != x[n]) {
                b = false;
                break;
            }
            ++n;
        }
        if (b) {
            return 4;
        }
        final byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        int i = 0;
        while (true) {
            while (i < bytes.length) {
                if (array[i] != bytes[i]) {
                    int n2 = 0;
                    if (n2 != 0) {
                        return 9;
                    }
                    Label_0433: {
                        Object o = null;
                        try {
                            bufferedInputStream = (BufferedInputStream)new b(array);
                            try {
                                long long1 = ((b)bufferedInputStream).readInt();
                                final byte[] array2 = new byte[4];
                                bufferedInputStream.read(array2);
                                if (!Arrays.equals(array2, q4.a.y)) {}
                                long n3 = 16L;
                                if (long1 != 1L || (long1 = ((b)bufferedInputStream).readLong()) < 16L) {
                                    n3 = 8L;
                                }
                                final long n4 = 5000;
                                long n5 = long1;
                                if (long1 > n4) {
                                    n5 = n4;
                                }
                                final long n6 = n5 - n3;
                                if (n6 < 8L) {}
                                final byte[] array3 = new byte[4];
                                long n7 = 0L;
                                int n8;
                                n2 = (n8 = 0);
                                Block_18: {
                                    while (n7 < n6 / 4L) {
                                        if (bufferedInputStream.read(array3) != 4) {}
                                        int n9;
                                        if (n7 == 1L) {
                                            n9 = n8;
                                        }
                                        else {
                                            int n10;
                                            if (Arrays.equals(array3, q4.a.z)) {
                                                n10 = 1;
                                            }
                                            else {
                                                final boolean equals = Arrays.equals(array3, q4.a.A);
                                                n10 = n2;
                                                if (equals) {
                                                    n8 = 1;
                                                    n10 = n2;
                                                }
                                            }
                                            n2 = n10;
                                            n9 = n8;
                                            if (n10 != 0) {
                                                n2 = n10;
                                                if ((n9 = n8) != 0) {
                                                    break Block_18;
                                                }
                                            }
                                        }
                                        ++n7;
                                        n8 = n9;
                                    }
                                    break Label_0433;
                                }
                                bufferedInputStream.close();
                                n2 = 1;
                            }
                            catch (final Exception ex) {}
                        }
                        catch (final Exception o) {
                            bufferedInputStream = null;
                        }
                        finally {
                            o = null;
                            goto Label_0779;
                        }
                        try {
                            if (q4.a.s) {
                                Log.d("ExifInterface", "Exception parsing HEIF file type box.", (Throwable)o);
                            }
                            if (bufferedInputStream != null) {
                                o = bufferedInputStream;
                                ((InputStream)o).close();
                            }
                            n2 = 0;
                            if (n2 != 0) {
                                return 12;
                            }
                            try {
                                bufferedInputStream = (BufferedInputStream)new b(array);
                                try {
                                    final ByteOrder c = C((b)bufferedInputStream);
                                    this.g = c;
                                    ((b)bufferedInputStream).g = c;
                                    n2 = ((b)bufferedInputStream).readShort();
                                    if (n2 != 20306 && n2 != 21330) {
                                        n2 = 0;
                                    }
                                    else {
                                        n2 = 1;
                                    }
                                    bufferedInputStream.close();
                                }
                                catch (final Exception ex2) {}
                            }
                            catch (final Exception ex3) {}
                            try {
                                bufferedInputStream = (BufferedInputStream)new b(array);
                                try {
                                    final ByteOrder c2 = C((b)bufferedInputStream);
                                    this.g = c2;
                                    ((b)bufferedInputStream).g = c2;
                                    n2 = ((b)bufferedInputStream).readShort();
                                    if (n2 == 85) {
                                        n2 = 1;
                                    }
                                    else {
                                        n2 = 0;
                                    }
                                    bufferedInputStream.close();
                                }
                                catch (final Exception ex4) {}
                            }
                            catch (final Exception ex5) {}
                        }
                        finally {}
                    }
                }
                else {
                    ++i;
                }
            }
            int n2 = 1;
            continue;
        }
    }
    
    public final void o(b b) throws IOException {
        this.r(b);
        final d d = this.e[1].get("MakerNote");
        if (d != null) {
            b = new b(d.d);
            b.g = this.g;
            final byte[] b2 = q4.a.B;
            final byte[] array = new byte[b2.length];
            b.readFully(array);
            b.f(0L);
            final byte[] c = q4.a.C;
            final byte[] array2 = new byte[c.length];
            b.readFully(array2);
            if (Arrays.equals(array, b2)) {
                b.f(8L);
            }
            else if (Arrays.equals(array2, c)) {
                b.f(12L);
            }
            this.E(b, 6);
            final d d2 = this.e[7].get("PreviewImageStart");
            final d d3 = this.e[7].get("PreviewImageLength");
            if (d2 != null && d3 != null) {
                this.e[5].put("JPEGInterchangeFormat", d2);
                this.e[5].put("JPEGInterchangeFormatLength", d3);
            }
            final d d4 = this.e[8].get("AspectFrame");
            if (d4 != null) {
                final int[] array3 = (Object)d4.j(this.g);
                if (array3 != null && array3.length == 4) {
                    final int n = array3[2];
                    final int n2 = array3[0];
                    if (n > n2) {
                        final int n3 = array3[3];
                        final int n4 = array3[1];
                        if (n3 > n4) {
                            final int n5 = n - n2 + 1;
                            final int n6 = n3 - n4 + 1;
                            int n7;
                            int n8;
                            if ((n7 = n5) < (n8 = n6)) {
                                final int n9 = n5 + n6;
                                n8 = n9 - n6;
                                n7 = n9 - n8;
                            }
                            final d e = q4.a.d.e(n7, this.g);
                            final d e2 = q4.a.d.e(n8, this.g);
                            this.e[0].put("ImageWidth", e);
                            this.e[0].put("ImageLength", e2);
                        }
                    }
                }
                else {
                    final StringBuilder k = a.k("Invalid aspect frame values. frame=");
                    k.append(Arrays.toString(array3));
                    Log.w("ExifInterface", k.toString());
                }
            }
        }
    }
    
    public final void p(final b b) throws IOException {
        if (q4.a.s) {
            final StringBuilder sb = new StringBuilder();
            sb.append("getPngAttributes starting with: ");
            sb.append(b);
            Log.d("ExifInterface", sb.toString());
        }
        b.mark(0);
        b.g = ByteOrder.BIG_ENDIAN;
        final byte[] d = q4.a.D;
        b.skipBytes(d.length);
        int n = d.length + 0;
        try {
            while (true) {
                int int1 = b.readInt();
                final byte[] array = new byte[4];
                Label_0347: {
                    if (b.read(array) != 4) {
                        break Label_0347;
                    }
                    final int n2 = n + 4 + 4;
                    if (n2 == 16 && !Arrays.equals(array, q4.a.F)) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                    }
                    if (Arrays.equals(array, q4.a.G)) {
                        break;
                    }
                    if (Arrays.equals(array, q4.a.E)) {
                        final byte[] array2 = new byte[int1];
                        if (b.read(array2) != int1) {
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append("Failed to read given length for given PNG chunk type: ");
                            sb2.append(b(array));
                            throw new IOException(sb2.toString());
                        }
                        final int int2 = b.readInt();
                        final CRC32 crc32 = new CRC32();
                        crc32.update(array);
                        crc32.update(array2);
                        if ((int)crc32.getValue() == int2) {
                            this.n = n2;
                            this.D(0, array2);
                            this.O();
                            this.L(new b(array2));
                            break;
                        }
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: ");
                        sb3.append(int2);
                        sb3.append(", calculated CRC value: ");
                        sb3.append(crc32.getValue());
                        throw new IOException(sb3.toString());
                    }
                    int1 += 4;
                    try {
                        b.skipBytes(int1);
                        n = n2 + int1;
                        continue;
                        throw new IOException("Encountered invalid length while parsing PNG chunktype");
                    }
                    catch (final EOFException ex) {
                        throw new IOException("Encountered corrupt PNG file.");
                    }
                }
            }
        }
        catch (final EOFException ex2) {}
    }
    
    public final void q(final b b) throws IOException {
        final boolean s = q4.a.s;
        if (s) {
            final StringBuilder sb = new StringBuilder();
            sb.append("getRafAttributes starting with: ");
            sb.append(b);
            Log.d("ExifInterface", sb.toString());
        }
        b.mark(0);
        b.skipBytes(84);
        final byte[] array = new byte[4];
        final byte[] array2 = new byte[4];
        final byte[] array3 = new byte[4];
        b.read(array);
        b.read(array2);
        b.read(array3);
        final int int1 = ByteBuffer.wrap(array).getInt();
        final int int2 = ByteBuffer.wrap(array2).getInt();
        final int int3 = ByteBuffer.wrap(array3).getInt();
        final byte[] array4 = new byte[int2];
        b.f(int1);
        b.read(array4);
        this.m(new b(array4), int1, 5);
        b.f(int3);
        b.g = ByteOrder.BIG_ENDIAN;
        final int int4 = b.readInt();
        if (s) {
            s0.u("numberOfDirectoryEntry: ", int4, "ExifInterface");
        }
        for (int i = 0; i < int4; ++i) {
            final int unsignedShort = b.readUnsignedShort();
            final int unsignedShort2 = b.readUnsignedShort();
            if (unsignedShort == q4.a.T.a) {
                final short short1 = b.readShort();
                final short short2 = b.readShort();
                final d e = q4.a.d.e(short1, this.g);
                final d e2 = q4.a.d.e(short2, this.g);
                this.e[0].put("ImageLength", e);
                this.e[0].put("ImageWidth", e2);
                if (q4.a.s) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Updated to length: ");
                    sb2.append(short1);
                    sb2.append(", width: ");
                    sb2.append(short2);
                    Log.d("ExifInterface", sb2.toString());
                }
                return;
            }
            b.skipBytes(unsignedShort2);
        }
    }
    
    public final void r(b b) throws IOException {
        this.A(b, b.available());
        this.E(b, 0);
        this.N(b, 0);
        this.N(b, 5);
        this.N(b, 4);
        this.O();
        if (this.d == 8) {
            final d d = this.e[1].get("MakerNote");
            if (d != null) {
                b = new b(d.d);
                b.g = this.g;
                b.f(6L);
                this.E(b, 9);
                final d d2 = this.e[9].get("ColorSpace");
                if (d2 != null) {
                    this.e[1].put("ColorSpace", d2);
                }
            }
        }
    }
    
    public final void s(final b b) throws IOException {
        if (q4.a.s) {
            final StringBuilder sb = new StringBuilder();
            sb.append("getRw2Attributes starting with: ");
            sb.append(b);
            Log.d("ExifInterface", sb.toString());
        }
        this.r(b);
        final d d = this.e[0].get("JpgFromRaw");
        if (d != null) {
            this.m(new b(d.d), (int)d.c, 5);
        }
        final d d2 = this.e[0].get("ISO");
        final d d3 = this.e[1].get("PhotographicSensitivity");
        if (d2 != null && d3 == null) {
            this.e[1].put("PhotographicSensitivity", d2);
        }
    }
    
    public final byte[] t() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        q4/a.h:Z
        //     4: istore_1       
        //     5: aconst_null    
        //     6: astore_2       
        //     7: aconst_null    
        //     8: astore_3       
        //     9: iload_1        
        //    10: ifne            15
        //    13: aconst_null    
        //    14: areturn        
        //    15: aload_0        
        //    16: getfield        q4/a.l:[B
        //    19: astore          4
        //    21: aload           4
        //    23: ifnull          29
        //    26: aload           4
        //    28: areturn        
        //    29: aload_0        
        //    30: getfield        q4/a.c:Landroid/content/res/AssetManager$AssetInputStream;
        //    33: astore          4
        //    35: aload           4
        //    37: ifnull          94
        //    40: aload           4
        //    42: invokevirtual   java/io/InputStream.markSupported:()Z
        //    45: ifeq            56
        //    48: aload           4
        //    50: invokevirtual   java/io/InputStream.reset:()V
        //    53: goto            114
        //    56: ldc             "ExifInterface"
        //    58: ldc_w           "Cannot read thumbnail from inputstream without mark/reset support"
        //    61: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //    64: pop            
        //    65: aload           4
        //    67: invokestatic    q4/a.c:(Ljava/io/Closeable;)V
        //    70: aconst_null    
        //    71: areturn        
        //    72: astore          5
        //    74: aload_3        
        //    75: astore_2       
        //    76: aload           4
        //    78: astore_3       
        //    79: aload_2        
        //    80: astore          4
        //    82: aload_3        
        //    83: astore_2       
        //    84: goto            462
        //    87: astore_2       
        //    88: aconst_null    
        //    89: astore          5
        //    91: goto            403
        //    94: aload_0        
        //    95: getfield        q4/a.a:Ljava/lang/String;
        //    98: ifnull          120
        //   101: new             Ljava/io/FileInputStream;
        //   104: dup            
        //   105: aload_0        
        //   106: getfield        q4/a.a:Ljava/lang/String;
        //   109: invokespecial   java/io/FileInputStream.<init>:(Ljava/lang/String;)V
        //   112: astore          4
        //   114: aconst_null    
        //   115: astore          5
        //   117: goto            160
        //   120: aload_0        
        //   121: getfield        q4/a.b:Ljava/io/FileDescriptor;
        //   124: invokestatic    android/system/Os.dup:(Ljava/io/FileDescriptor;)Ljava/io/FileDescriptor;
        //   127: astore          4
        //   129: aload           4
        //   131: lconst_0       
        //   132: getstatic       android/system/OsConstants.SEEK_SET:I
        //   135: invokestatic    android/system/Os.lseek:(Ljava/io/FileDescriptor;JI)J
        //   138: pop2           
        //   139: new             Ljava/io/FileInputStream;
        //   142: dup            
        //   143: aload           4
        //   145: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/FileDescriptor;)V
        //   148: astore          5
        //   150: aload           5
        //   152: astore_2       
        //   153: aload           4
        //   155: astore          5
        //   157: aload_2        
        //   158: astore          4
        //   160: aload           4
        //   162: astore_3       
        //   163: aload           5
        //   165: astore          6
        //   167: aload           4
        //   169: aload_0        
        //   170: getfield        q4/a.j:I
        //   173: aload_0        
        //   174: getfield        q4/a.n:I
        //   177: iadd           
        //   178: i2l            
        //   179: invokevirtual   java/io/InputStream.skip:(J)J
        //   182: lstore          7
        //   184: aload           4
        //   186: astore_3       
        //   187: aload           5
        //   189: astore          6
        //   191: aload_0        
        //   192: getfield        q4/a.j:I
        //   195: istore          9
        //   197: aload           4
        //   199: astore_3       
        //   200: aload           5
        //   202: astore          6
        //   204: aload_0        
        //   205: getfield        q4/a.n:I
        //   208: istore          10
        //   210: lload           7
        //   212: iload           9
        //   214: iload           10
        //   216: iadd           
        //   217: i2l            
        //   218: lcmp           
        //   219: ifne            333
        //   222: aload           4
        //   224: astore_3       
        //   225: aload           5
        //   227: astore          6
        //   229: aload_0        
        //   230: getfield        q4/a.k:I
        //   233: newarray        B
        //   235: astore_2       
        //   236: aload           4
        //   238: astore_3       
        //   239: aload           5
        //   241: astore          6
        //   243: aload           4
        //   245: aload_2        
        //   246: invokevirtual   java/io/InputStream.read:([B)I
        //   249: aload_0        
        //   250: getfield        q4/a.k:I
        //   253: if_icmpne       299
        //   256: aload           4
        //   258: astore_3       
        //   259: aload           5
        //   261: astore          6
        //   263: aload_0        
        //   264: aload_2        
        //   265: putfield        q4/a.l:[B
        //   268: aload           4
        //   270: invokestatic    q4/a.c:(Ljava/io/Closeable;)V
        //   273: aload           5
        //   275: ifnull          297
        //   278: aload           5
        //   280: invokestatic    android/system/Os.close:(Ljava/io/FileDescriptor;)V
        //   283: goto            297
        //   286: astore          4
        //   288: ldc             "ExifInterface"
        //   290: ldc_w           "Error closing fd."
        //   293: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   296: pop            
        //   297: aload_2        
        //   298: areturn        
        //   299: aload           4
        //   301: astore_3       
        //   302: aload           5
        //   304: astore          6
        //   306: new             Ljava/io/IOException;
        //   309: astore_2       
        //   310: aload           4
        //   312: astore_3       
        //   313: aload           5
        //   315: astore          6
        //   317: aload_2        
        //   318: ldc_w           "Corrupted image"
        //   321: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   324: aload           4
        //   326: astore_3       
        //   327: aload           5
        //   329: astore          6
        //   331: aload_2        
        //   332: athrow         
        //   333: aload           4
        //   335: astore_3       
        //   336: aload           5
        //   338: astore          6
        //   340: new             Ljava/io/IOException;
        //   343: astore_2       
        //   344: aload           4
        //   346: astore_3       
        //   347: aload           5
        //   349: astore          6
        //   351: aload_2        
        //   352: ldc_w           "Corrupted image"
        //   355: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   358: aload           4
        //   360: astore_3       
        //   361: aload           5
        //   363: astore          6
        //   365: aload_2        
        //   366: athrow         
        //   367: astore_2       
        //   368: goto            403
        //   371: astore          5
        //   373: goto            462
        //   376: astore_2       
        //   377: aload           4
        //   379: astore          5
        //   381: aconst_null    
        //   382: astore          4
        //   384: goto            403
        //   387: astore          5
        //   389: aconst_null    
        //   390: astore          4
        //   392: goto            462
        //   395: astore_2       
        //   396: aconst_null    
        //   397: astore          4
        //   399: aload           4
        //   401: astore          5
        //   403: aload           4
        //   405: astore_3       
        //   406: aload           5
        //   408: astore          6
        //   410: ldc             "ExifInterface"
        //   412: ldc_w           "Encountered exception while getting thumbnail"
        //   415: aload_2        
        //   416: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   419: pop            
        //   420: aload           4
        //   422: invokestatic    q4/a.c:(Ljava/io/Closeable;)V
        //   425: aload           5
        //   427: ifnull          449
        //   430: aload           5
        //   432: invokestatic    android/system/Os.close:(Ljava/io/FileDescriptor;)V
        //   435: goto            449
        //   438: astore          4
        //   440: ldc             "ExifInterface"
        //   442: ldc_w           "Error closing fd."
        //   445: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   448: pop            
        //   449: aconst_null    
        //   450: areturn        
        //   451: astore          5
        //   453: aload           6
        //   455: astore_2       
        //   456: aload_3        
        //   457: astore          4
        //   459: goto            76
        //   462: aload_2        
        //   463: invokestatic    q4/a.c:(Ljava/io/Closeable;)V
        //   466: aload           4
        //   468: ifnull          490
        //   471: aload           4
        //   473: invokestatic    android/system/Os.close:(Ljava/io/FileDescriptor;)V
        //   476: goto            490
        //   479: astore          4
        //   481: ldc             "ExifInterface"
        //   483: ldc_w           "Error closing fd."
        //   486: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   489: pop            
        //   490: aload           5
        //   492: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  29     35     395    403    Ljava/lang/Exception;
        //  29     35     387    395    Any
        //  40     53     87     94     Ljava/lang/Exception;
        //  40     53     72     76     Any
        //  56     65     87     94     Ljava/lang/Exception;
        //  56     65     72     76     Any
        //  94     114    395    403    Ljava/lang/Exception;
        //  94     114    387    395    Any
        //  120    129    395    403    Ljava/lang/Exception;
        //  120    129    387    395    Any
        //  129    150    376    387    Ljava/lang/Exception;
        //  129    150    371    376    Any
        //  167    184    367    371    Ljava/lang/Exception;
        //  167    184    451    462    Any
        //  191    197    367    371    Ljava/lang/Exception;
        //  191    197    451    462    Any
        //  204    210    367    371    Ljava/lang/Exception;
        //  204    210    451    462    Any
        //  229    236    367    371    Ljava/lang/Exception;
        //  229    236    451    462    Any
        //  243    256    367    371    Ljava/lang/Exception;
        //  243    256    451    462    Any
        //  263    268    367    371    Ljava/lang/Exception;
        //  263    268    451    462    Any
        //  278    283    286    297    Ljava/lang/Exception;
        //  306    310    367    371    Ljava/lang/Exception;
        //  306    310    451    462    Any
        //  317    324    367    371    Ljava/lang/Exception;
        //  317    324    451    462    Any
        //  331    333    367    371    Ljava/lang/Exception;
        //  331    333    451    462    Any
        //  340    344    367    371    Ljava/lang/Exception;
        //  340    344    451    462    Any
        //  351    358    367    371    Ljava/lang/Exception;
        //  351    358    451    462    Any
        //  365    367    367    371    Ljava/lang/Exception;
        //  365    367    451    462    Any
        //  410    420    451    462    Any
        //  430    435    438    449    Ljava/lang/Exception;
        //  471    476    479    490    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0297:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void u(final b b) throws IOException {
        if (q4.a.s) {
            final StringBuilder sb = new StringBuilder();
            sb.append("getWebpAttributes starting with: ");
            sb.append(b);
            Log.d("ExifInterface", sb.toString());
        }
        b.mark(0);
        b.g = ByteOrder.LITTLE_ENDIAN;
        b.skipBytes(q4.a.H.length);
        final int n = b.readInt() + 8;
        int n2 = b.skipBytes(q4.a.I.length) + 8;
        try {
            while (true) {
                final byte[] array = new byte[4];
                if (b.read(array) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                final int int1 = b.readInt();
                final int n3 = n2 + 4 + 4;
                if (Arrays.equals(q4.a.J, array)) {
                    final byte[] array2 = new byte[int1];
                    if (b.read(array2) == int1) {
                        this.n = n3;
                        this.D(0, array2);
                        this.L(new b(array2));
                        break;
                    }
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Failed to read given length for given PNG chunk type: ");
                    sb2.append(b(array));
                    throw new IOException(sb2.toString());
                }
                else {
                    int n4 = int1;
                    if (int1 % 2 == 1) {
                        n4 = int1 + 1;
                    }
                    final int n5 = n3 + n4;
                    if (n5 == n) {
                        break;
                    }
                    if (n5 > n) {
                        throw new IOException("Encountered WebP file with invalid chunk size");
                    }
                    final int skipBytes = b.skipBytes(n4);
                    if (skipBytes != n4) {
                        throw new IOException("Encountered WebP file with invalid chunk size");
                    }
                    n2 = n3 + skipBytes;
                }
            }
        }
        catch (final EOFException ex) {
            throw new IOException("Encountered corrupt WebP file.");
        }
    }
    
    public final void w(final b b, final HashMap hashMap) throws IOException {
        final d d = hashMap.get("JPEGInterchangeFormat");
        final d d2 = hashMap.get("JPEGInterchangeFormatLength");
        if (d != null && d2 != null) {
            final int h = d.h(this.g);
            final int h2 = d2.h(this.g);
            int j = h;
            if (this.d == 7) {
                j = h + this.o;
            }
            final int min = Math.min(h2, b.h - j);
            if (j > 0 && min > 0) {
                this.h = true;
                if (this.a == null && this.c == null && this.b == null) {
                    final byte[] l = new byte[min];
                    b.skip(j);
                    b.read(l);
                    this.l = l;
                }
                this.j = j;
                this.k = min;
            }
            if (q4.a.s) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Setting thumbnail attributes with offset: ");
                sb.append(j);
                sb.append(", length: ");
                sb.append(min);
                Log.d("ExifInterface", sb.toString());
            }
        }
    }
    
    public final void x(final String a) throws IOException {
        if (a == null) {
            throw new NullPointerException("filename cannot be null");
        }
        final Closeable closeable = null;
        this.c = null;
        this.a = a;
        Closeable closeable2;
        try {
            final FileInputStream fileInputStream = new FileInputStream(a);
            try {
                final FileDescriptor fd = fileInputStream.getFD();
                boolean b;
                try {
                    Os.lseek(fd, 0L, OsConstants.SEEK_CUR);
                    b = true;
                }
                catch (final Exception ex) {
                    if (a.s) {
                        Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                    }
                    b = false;
                }
                if (b) {
                    this.b = fileInputStream.getFD();
                }
                else {
                    this.b = null;
                }
                this.z(fileInputStream);
                c(fileInputStream);
                return;
            }
            finally {}
        }
        finally {
            closeable2 = closeable;
        }
        c(closeable2);
    }
    
    public final boolean y(final HashMap hashMap) throws IOException {
        final d d = hashMap.get("ImageLength");
        final d d2 = hashMap.get("ImageWidth");
        if (d != null && d2 != null) {
            final int h = d.h(this.g);
            final int h2 = d2.h(this.g);
            if (h <= 512 && h2 <= 512) {
                return true;
            }
        }
        return false;
    }
    
    public final void z(final InputStream inputStream) {
        if (inputStream != null) {
            int i = 0;
            try {
                Label_0327: {
                    try {
                        while (i < q4.a.U.length) {
                            this.e[i] = new HashMap<String, d>();
                            ++i;
                        }
                        final BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
                        this.d = this.n(bufferedInputStream);
                        final b b = new b(bufferedInputStream);
                        switch (this.d) {
                            case 14: {
                                this.u(b);
                                this.a();
                                if (q4.a.s) {
                                    this.B();
                                }
                                return;
                            }
                            case 13: {
                                this.p(b);
                                this.a();
                                if (q4.a.s) {
                                    this.B();
                                }
                                return;
                            }
                            case 12: {
                                this.l(b);
                                break;
                            }
                            case 10: {
                                this.s(b);
                                this.a();
                                if (q4.a.s) {
                                    this.B();
                                }
                                return;
                            }
                            case 9: {
                                this.q(b);
                                this.a();
                                if (q4.a.s) {
                                    this.B();
                                }
                                return;
                            }
                            case 7: {
                                this.o(b);
                                break;
                            }
                            case 4: {
                                this.m(b, 0, 0);
                                this.a();
                                if (q4.a.s) {
                                    this.B();
                                }
                                return;
                            }
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 5:
                            case 6:
                            case 8:
                            case 11: {
                                this.r(b);
                                break;
                            }
                        }
                        b.f(this.n);
                        this.L(b);
                        this.a();
                        if (q4.a.s) {
                            break Label_0327;
                        }
                        return;
                    }
                    finally {
                        this.a();
                        if (q4.a.s) {
                            this.B();
                        }
                        Label_0331: {
                            return;
                        }
                        final IOException ex;
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", (Throwable)ex);
                        this.a();
                        final int n;
                        iftrue(Label_0331:)(n == 0);
                        this.B();
                    }
                }
            }
            catch (final IOException ex2) {}
        }
        throw new NullPointerException("inputstream shouldn't be null");
    }
    
    public static final class b extends InputStream implements DataInput
    {
        public static final ByteOrder j;
        public static final ByteOrder k;
        public DataInputStream f;
        public ByteOrder g;
        public final int h;
        public int i;
        
        static {
            j = ByteOrder.LITTLE_ENDIAN;
            k = ByteOrder.BIG_ENDIAN;
        }
        
        public b(final InputStream inputStream) throws IOException {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }
        
        public b(final InputStream inputStream, final ByteOrder g) throws IOException {
            this.g = ByteOrder.BIG_ENDIAN;
            final DataInputStream f = new DataInputStream(inputStream);
            this.f = f;
            final int available = f.available();
            this.h = available;
            this.i = 0;
            this.f.mark(available);
            this.g = g;
        }
        
        public b(final byte[] array) throws IOException {
            this(new ByteArrayInputStream(array));
        }
        
        @Override
        public final int available() throws IOException {
            return this.f.available();
        }
        
        public final void f(long n) throws IOException {
            final int i = this.i;
            if (i > n) {
                this.i = 0;
                this.f.reset();
                this.f.mark(this.h);
            }
            else {
                n -= i;
            }
            final int n2 = (int)n;
            if (this.skipBytes(n2) == n2) {
                return;
            }
            throw new IOException("Couldn't seek up to the byteCount");
        }
        
        @Override
        public final void mark(final int n) {
            synchronized (this) {
                this.f.mark(n);
            }
        }
        
        @Override
        public final int read() throws IOException {
            ++this.i;
            return this.f.read();
        }
        
        @Override
        public final int read(final byte[] array, int read, final int n) throws IOException {
            read = this.f.read(array, read, n);
            this.i += read;
            return read;
        }
        
        @Override
        public final boolean readBoolean() throws IOException {
            ++this.i;
            return this.f.readBoolean();
        }
        
        @Override
        public final byte readByte() throws IOException {
            final int i = this.i + 1;
            this.i = i;
            if (i > this.h) {
                throw new EOFException();
            }
            final int read = this.f.read();
            if (read >= 0) {
                return (byte)read;
            }
            throw new EOFException();
        }
        
        @Override
        public final char readChar() throws IOException {
            this.i += 2;
            return this.f.readChar();
        }
        
        @Override
        public final double readDouble() throws IOException {
            return Double.longBitsToDouble(this.readLong());
        }
        
        @Override
        public final float readFloat() throws IOException {
            return Float.intBitsToFloat(this.readInt());
        }
        
        @Override
        public final void readFully(final byte[] array) throws IOException {
            final int i = this.i + array.length;
            this.i = i;
            if (i > this.h) {
                throw new EOFException();
            }
            if (this.f.read(array, 0, array.length) == array.length) {
                return;
            }
            throw new IOException("Couldn't read up to the length of buffer");
        }
        
        @Override
        public final void readFully(final byte[] array, final int n, final int n2) throws IOException {
            final int i = this.i + n2;
            this.i = i;
            if (i > this.h) {
                throw new EOFException();
            }
            if (this.f.read(array, n, n2) == n2) {
                return;
            }
            throw new IOException("Couldn't read up to the length of buffer");
        }
        
        @Override
        public final int readInt() throws IOException {
            final int i = this.i + 4;
            this.i = i;
            if (i > this.h) {
                throw new EOFException();
            }
            final int read = this.f.read();
            final int read2 = this.f.read();
            final int read3 = this.f.read();
            final int read4 = this.f.read();
            if ((read | read2 | read3 | read4) < 0) {
                throw new EOFException();
            }
            final ByteOrder g = this.g;
            if (g == b.j) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (g == b.k) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            final StringBuilder k = a.k("Invalid byte order: ");
            k.append(this.g);
            throw new IOException(k.toString());
        }
        
        @Override
        public final String readLine() throws IOException {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }
        
        @Override
        public final long readLong() throws IOException {
            final int i = this.i + 8;
            this.i = i;
            if (i > this.h) {
                throw new EOFException();
            }
            final int read = this.f.read();
            final int read2 = this.f.read();
            final int read3 = this.f.read();
            final int read4 = this.f.read();
            final int read5 = this.f.read();
            final int read6 = this.f.read();
            final int read7 = this.f.read();
            final int read8 = this.f.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
                throw new EOFException();
            }
            final ByteOrder g = this.g;
            if (g == b.j) {
                return ((long)read8 << 56) + ((long)read7 << 48) + ((long)read6 << 40) + ((long)read5 << 32) + ((long)read4 << 24) + ((long)read3 << 16) + ((long)read2 << 8) + read;
            }
            if (g == b.k) {
                return ((long)read << 56) + ((long)read2 << 48) + ((long)read3 << 40) + ((long)read4 << 32) + ((long)read5 << 24) + ((long)read6 << 16) + ((long)read7 << 8) + read8;
            }
            final StringBuilder k = a.k("Invalid byte order: ");
            k.append(this.g);
            throw new IOException(k.toString());
        }
        
        @Override
        public final short readShort() throws IOException {
            final int i = this.i + 2;
            this.i = i;
            if (i > this.h) {
                throw new EOFException();
            }
            final int read = this.f.read();
            final int read2 = this.f.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            final ByteOrder g = this.g;
            if (g == b.j) {
                return (short)((read2 << 8) + read);
            }
            if (g == b.k) {
                return (short)((read << 8) + read2);
            }
            final StringBuilder k = a.k("Invalid byte order: ");
            k.append(this.g);
            throw new IOException(k.toString());
        }
        
        @Override
        public final String readUTF() throws IOException {
            this.i += 2;
            return this.f.readUTF();
        }
        
        @Override
        public final int readUnsignedByte() throws IOException {
            ++this.i;
            return this.f.readUnsignedByte();
        }
        
        @Override
        public final int readUnsignedShort() throws IOException {
            final int i = this.i + 2;
            this.i = i;
            if (i > this.h) {
                throw new EOFException();
            }
            final int read = this.f.read();
            final int read2 = this.f.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            final ByteOrder g = this.g;
            if (g == b.j) {
                return (read2 << 8) + read;
            }
            if (g == b.k) {
                return (read << 8) + read2;
            }
            final StringBuilder k = a.k("Invalid byte order: ");
            k.append(this.g);
            throw new IOException(k.toString());
        }
        
        @Override
        public final int skipBytes(int i) throws IOException {
            int min;
            for (min = Math.min(i, this.h - this.i), i = 0; i < min; i += this.f.skipBytes(min - i)) {}
            this.i += i;
            return i;
        }
    }
    
    public static final class c extends FilterOutputStream
    {
        public final OutputStream f;
        public ByteOrder g;
        
        public c(final OutputStream f, final ByteOrder g) {
            super(f);
            this.f = f;
            this.g = g;
        }
        
        public final void b(final int n) throws IOException {
            this.f.write(n);
        }
        
        public final void h(final int n) throws IOException {
            final ByteOrder g = this.g;
            if (g == ByteOrder.LITTLE_ENDIAN) {
                this.f.write(n >>> 0 & 0xFF);
                this.f.write(n >>> 8 & 0xFF);
                this.f.write(n >>> 16 & 0xFF);
                this.f.write(n >>> 24 & 0xFF);
            }
            else if (g == ByteOrder.BIG_ENDIAN) {
                this.f.write(n >>> 24 & 0xFF);
                this.f.write(n >>> 16 & 0xFF);
                this.f.write(n >>> 8 & 0xFF);
                this.f.write(n >>> 0 & 0xFF);
            }
        }
        
        public final void k(final short n) throws IOException {
            final ByteOrder g = this.g;
            if (g == ByteOrder.LITTLE_ENDIAN) {
                this.f.write(n >>> 0 & 0xFF);
                this.f.write(n >>> 8 & 0xFF);
            }
            else if (g == ByteOrder.BIG_ENDIAN) {
                this.f.write(n >>> 8 & 0xFF);
                this.f.write(n >>> 0 & 0xFF);
            }
        }
        
        @Override
        public final void write(final byte[] array) throws IOException {
            this.f.write(array);
        }
        
        @Override
        public final void write(final byte[] array, final int n, final int n2) throws IOException {
            this.f.write(array, n, n2);
        }
    }
    
    public static final class d
    {
        public final int a;
        public final int b;
        public final long c;
        public final byte[] d;
        
        public d(final int n, final int n2, final byte[] array) {
            this(-1L, array, n, n2);
        }
        
        public d(final long c, final byte[] d, final int a, final int b) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        public static d a(final String s) {
            final byte[] bytes = b.g(s, '\0').getBytes(a.c0);
            return new d(2, bytes.length, bytes);
        }
        
        public static d b(final long n, final ByteOrder byteOrder) {
            return c(new long[] { n }, byteOrder);
        }
        
        public static d c(final long[] array, final ByteOrder byteOrder) {
            final ByteBuffer wrap = ByteBuffer.wrap(new byte[a.R[4] * array.length]);
            wrap.order(byteOrder);
            for (int length = array.length, i = 0; i < length; ++i) {
                wrap.putInt((int)array[i]);
            }
            return new d(4, array.length, wrap.array());
        }
        
        public static d d(final f[] array, final ByteOrder byteOrder) {
            final ByteBuffer wrap = ByteBuffer.wrap(new byte[a.R[5] * array.length]);
            wrap.order(byteOrder);
            for (final f f : array) {
                wrap.putInt((int)f.a);
                wrap.putInt((int)f.b);
            }
            return new d(5, array.length, wrap.array());
        }
        
        public static d e(final int n, final ByteOrder byteOrder) {
            return f(new int[] { n }, byteOrder);
        }
        
        public static d f(final int[] array, final ByteOrder byteOrder) {
            final ByteBuffer wrap = ByteBuffer.wrap(new byte[a.R[3] * array.length]);
            wrap.order(byteOrder);
            for (int length = array.length, i = 0; i < length; ++i) {
                wrap.putShort((short)array[i]);
            }
            return new d(3, array.length, wrap.array());
        }
        
        public final double g(final ByteOrder byteOrder) {
            final Serializable j = this.j(byteOrder);
            if (j == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (j instanceof String) {
                return Double.parseDouble((String)j);
            }
            if (j instanceof long[]) {
                final long[] array = (Object)j;
                if (array.length == 1) {
                    return (double)array[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            else if (j instanceof int[]) {
                final int[] array2 = (Object)j;
                if (array2.length == 1) {
                    return array2[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            else if (j instanceof double[]) {
                final double[] array3 = (Object)j;
                if (array3.length == 1) {
                    return array3[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            else {
                if (!(j instanceof f[])) {
                    throw new NumberFormatException("Couldn't find a double value");
                }
                final f[] array4 = (Object)j;
                if (array4.length == 1) {
                    final f f = array4[0];
                    return f.a / (double)f.b;
                }
                throw new NumberFormatException("There are more than one component");
            }
        }
        
        public final int h(final ByteOrder byteOrder) {
            final Serializable j = this.j(byteOrder);
            if (j == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (j instanceof String) {
                return Integer.parseInt((String)j);
            }
            if (j instanceof long[]) {
                final long[] array = (Object)j;
                if (array.length == 1) {
                    return (int)array[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            else {
                if (!(j instanceof int[])) {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
                final int[] array2 = (Object)j;
                if (array2.length == 1) {
                    return array2[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
        }
        
        public final String i(final ByteOrder byteOrder) {
            final Serializable j = this.j(byteOrder);
            if (j == null) {
                return null;
            }
            if (j instanceof String) {
                return (String)j;
            }
            final StringBuilder sb = new StringBuilder();
            final boolean b = j instanceof long[];
            final int n = 0;
            final int n2 = 0;
            final int n3 = 0;
            int i = 0;
            if (b) {
                int n4;
                for (long[] array = (Object)j; i < array.length; i = n4) {
                    sb.append(array[i]);
                    n4 = i + 1;
                    if ((i = n4) != array.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (j instanceof int[]) {
                final int[] array2 = (Object)j;
                int n5;
                for (int k = n; k < array2.length; k = n5) {
                    sb.append(array2[k]);
                    n5 = k + 1;
                    if ((k = n5) != array2.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (j instanceof double[]) {
                final double[] array3 = (Object)j;
                int n6;
                for (int l = n2; l < array3.length; l = n6) {
                    sb.append(array3[l]);
                    n6 = l + 1;
                    if ((l = n6) != array3.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (j instanceof f[]) {
                final f[] array4 = (Object)j;
                int n8;
                for (int n7 = n3; n7 < array4.length; n7 = n8) {
                    sb.append(array4[n7].a);
                    sb.append('/');
                    sb.append(array4[n7].b);
                    n8 = n7 + 1;
                    if ((n7 = n8) != array4.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            return null;
        }
        
        public final Serializable j(final ByteOrder p0) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: astore_2       
            //     2: new             Lq4/a$b;
            //     5: astore_3       
            //     6: aload_3        
            //     7: aload_0        
            //     8: getfield        q4/a$d.d:[B
            //    11: invokespecial   q4/a$b.<init>:([B)V
            //    14: aload_3        
            //    15: astore_2       
            //    16: aload_3        
            //    17: aload_1        
            //    18: putfield        q4/a$b.g:Ljava/nio/ByteOrder;
            //    21: aload_3        
            //    22: astore_2       
            //    23: aload_0        
            //    24: getfield        q4/a$d.a:I
            //    27: istore          4
            //    29: iconst_0       
            //    30: istore          5
            //    32: iconst_0       
            //    33: istore          6
            //    35: iconst_0       
            //    36: istore          7
            //    38: iconst_0       
            //    39: istore          8
            //    41: iconst_0       
            //    42: istore          9
            //    44: iconst_0       
            //    45: istore          10
            //    47: iconst_0       
            //    48: istore          11
            //    50: iconst_0       
            //    51: istore          12
            //    53: iconst_0       
            //    54: istore          13
            //    56: iconst_1       
            //    57: istore          14
            //    59: iload           4
            //    61: tableswitch {
            //                2: 830
            //                3: 645
            //                4: 586
            //                5: 522
            //                6: 433
            //                7: 830
            //                8: 645
            //                9: 374
            //               10: 315
            //               11: 242
            //               12: 182
            //               13: 127
            //          default: 124
            //        }
            //   124: goto            935
            //   127: aload_3        
            //   128: astore_2       
            //   129: aload_0        
            //   130: getfield        q4/a$d.b:I
            //   133: newarray        D
            //   135: astore_1       
            //   136: aload_3        
            //   137: astore_2       
            //   138: iload           13
            //   140: aload_0        
            //   141: getfield        q4/a$d.b:I
            //   144: if_icmpge       163
            //   147: aload_3        
            //   148: astore_2       
            //   149: aload_1        
            //   150: iload           13
            //   152: aload_3        
            //   153: invokevirtual   q4/a$b.readDouble:()D
            //   156: dastore        
            //   157: iinc            13, 1
            //   160: goto            136
            //   163: aload_3        
            //   164: invokevirtual   java/io/InputStream.close:()V
            //   167: goto            180
            //   170: astore_2       
            //   171: ldc             "ExifInterface"
            //   173: ldc             "IOException occurred while closing InputStream"
            //   175: aload_2        
            //   176: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
            //   179: pop            
            //   180: aload_1        
            //   181: areturn        
            //   182: aload_3        
            //   183: astore_2       
            //   184: aload_0        
            //   185: getfield        q4/a$d.b:I
            //   188: newarray        D
            //   190: astore_1       
            //   191: iload           5
            //   193: istore          13
            //   195: aload_3        
            //   196: astore_2       
            //   197: iload           13
            //   199: aload_0        
            //   200: getfield        q4/a$d.b:I
            //   203: if_icmpge       223
            //   206: aload_3        
            //   207: astore_2       
            //   208: aload_1        
            //   209: iload           13
            //   211: aload_3        
            //   212: invokevirtual   q4/a$b.readFloat:()F
            //   215: f2d            
            //   216: dastore        
            //   217: iinc            13, 1
            //   220: goto            195
            //   223: aload_3        
            //   224: invokevirtual   java/io/InputStream.close:()V
            //   227: goto            240
            //   230: astore_2       
            //   231: ldc             "ExifInterface"
            //   233: ldc             "IOException occurred while closing InputStream"
            //   235: aload_2        
            //   236: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
            //   239: pop            
            //   240: aload_1        
            //   241: areturn        
            //   242: aload_3        
            //   243: astore_2       
            //   244: aload_0        
            //   245: getfield        q4/a$d.b:I
            //   248: anewarray       Lq4/a$f;
            //   251: astore_1       
            //   252: iload           6
            //   254: istore          13
            //   256: aload_3        
            //   257: astore_2       
            //   258: iload           13
            //   260: aload_0        
            //   261: getfield        q4/a$d.b:I
            //   264: if_icmpge       296
            //   267: aload_3        
            //   268: astore_2       
            //   269: aload_1        
            //   270: iload           13
            //   272: new             Lq4/a$f;
            //   275: dup            
            //   276: aload_3        
            //   277: invokevirtual   q4/a$b.readInt:()I
            //   280: i2l            
            //   281: aload_3        
            //   282: invokevirtual   q4/a$b.readInt:()I
            //   285: i2l            
            //   286: invokespecial   q4/a$f.<init>:(JJ)V
            //   289: aastore        
            //   290: iinc            13, 1
            //   293: goto            256
            //   296: aload_3        
            //   297: invokevirtual   java/io/InputStream.close:()V
            //   300: goto            313
            //   303: astore_2       
            //   304: ldc             "ExifInterface"
            //   306: ldc             "IOException occurred while closing InputStream"
            //   308: aload_2        
            //   309: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
            //   312: pop            
            //   313: aload_1        
            //   314: areturn        
            //   315: aload_3        
            //   316: astore_2       
            //   317: aload_0        
            //   318: getfield        q4/a$d.b:I
            //   321: newarray        I
            //   323: astore_1       
            //   324: iload           7
            //   326: istore          13
            //   328: aload_3        
            //   329: astore_2       
            //   330: iload           13
            //   332: aload_0        
            //   333: getfield        q4/a$d.b:I
            //   336: if_icmpge       355
            //   339: aload_3        
            //   340: astore_2       
            //   341: aload_1        
            //   342: iload           13
            //   344: aload_3        
            //   345: invokevirtual   q4/a$b.readInt:()I
            //   348: iastore        
            //   349: iinc            13, 1
            //   352: goto            328
            //   355: aload_3        
            //   356: invokevirtual   java/io/InputStream.close:()V
            //   359: goto            372
            //   362: astore_2       
            //   363: ldc             "ExifInterface"
            //   365: ldc             "IOException occurred while closing InputStream"
            //   367: aload_2        
            //   368: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
            //   371: pop            
            //   372: aload_1        
            //   373: areturn        
            //   374: aload_3        
            //   375: astore_2       
            //   376: aload_0        
            //   377: getfield        q4/a$d.b:I
            //   380: newarray        I
            //   382: astore_1       
            //   383: iload           8
            //   385: istore          13
            //   387: aload_3        
            //   388: astore_2       
            //   389: iload           13
            //   391: aload_0        
            //   392: getfield        q4/a$d.b:I
            //   395: if_icmpge       414
            //   398: aload_3        
            //   399: astore_2       
            //   400: aload_1        
            //   401: iload           13
            //   403: aload_3        
            //   404: invokevirtual   q4/a$b.readShort:()S
            //   407: iastore        
            //   408: iinc            13, 1
            //   411: goto            387
            //   414: aload_3        
            //   415: invokevirtual   java/io/InputStream.close:()V
            //   418: goto            431
            //   421: astore_2       
            //   422: ldc             "ExifInterface"
            //   424: ldc             "IOException occurred while closing InputStream"
            //   426: aload_2        
            //   427: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
            //   430: pop            
            //   431: aload_1        
            //   432: areturn        
            //   433: aload_3        
            //   434: astore_2       
            //   435: aload_0        
            //   436: getfield        q4/a$d.b:I
            //   439: anewarray       Lq4/a$f;
            //   442: astore_1       
            //   443: iload           9
            //   445: istore          13
            //   447: aload_3        
            //   448: astore_2       
            //   449: iload           13
            //   451: aload_0        
            //   452: getfield        q4/a$d.b:I
            //   455: if_icmpge       503
            //   458: aload_3        
            //   459: astore_2       
            //   460: aload_1        
            //   461: iload           13
            //   463: new             Lq4/a$f;
            //   466: dup            
            //   467: aload_3        
            //   468: invokevirtual   q4/a$b.readInt:()I
            //   471: i2l            
            //   472: ldc2_w          4294967295
            //   475: land           
            //   476: aload_3        
            //   477: invokevirtual   q4/a$b.readInt:()I
            //   480: i2l            
            //   481: ldc2_w          4294967295
            //   484: land           
            //   485: invokespecial   q4/a$f.<init>:(JJ)V
            //   488: aastore        
            //   489: iinc            13, 1
            //   492: goto            447
            //   495: astore_2       
            //   496: aload_3        
            //   497: astore_1       
            //   498: aload_2        
            //   499: astore_3       
            //   500: goto            961
            //   503: aload_3        
            //   504: invokevirtual   java/io/InputStream.close:()V
            //   507: goto            520
            //   510: astore_2       
            //   511: ldc             "ExifInterface"
            //   513: ldc             "IOException occurred while closing InputStream"
            //   515: aload_2        
            //   516: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
            //   519: pop            
            //   520: aload_1        
            //   521: areturn        
            //   522: aload_3        
            //   523: astore_2       
            //   524: aload_0        
            //   525: getfield        q4/a$d.b:I
            //   528: newarray        J
            //   530: astore_1       
            //   531: iload           10
            //   533: istore          13
            //   535: aload_3        
            //   536: astore_2       
            //   537: iload           13
            //   539: aload_0        
            //   540: getfield        q4/a$d.b:I
            //   543: if_icmpge       567
            //   546: aload_3        
            //   547: astore_2       
            //   548: aload_1        
            //   549: iload           13
            //   551: aload_3        
            //   552: invokevirtual   q4/a$b.readInt:()I
            //   555: i2l            
            //   556: ldc2_w          4294967295
            //   559: land           
            //   560: lastore        
            //   561: iinc            13, 1
            //   564: goto            535
            //   567: aload_3        
            //   568: invokevirtual   java/io/InputStream.close:()V
            //   571: goto            584
            //   574: astore_2       
            //   575: ldc             "ExifInterface"
            //   577: ldc             "IOException occurred while closing InputStream"
            //   579: aload_2        
            //   580: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
            //   583: pop            
            //   584: aload_1        
            //   585: areturn        
            //   586: aload_3        
            //   587: astore_2       
            //   588: aload_0        
            //   589: getfield        q4/a$d.b:I
            //   592: newarray        I
            //   594: astore_1       
            //   595: iload           11
            //   597: istore          13
            //   599: aload_3        
            //   600: astore_2       
            //   601: iload           13
            //   603: aload_0        
            //   604: getfield        q4/a$d.b:I
            //   607: if_icmpge       626
            //   610: aload_3        
            //   611: astore_2       
            //   612: aload_1        
            //   613: iload           13
            //   615: aload_3        
            //   616: invokevirtual   q4/a$b.readUnsignedShort:()I
            //   619: iastore        
            //   620: iinc            13, 1
            //   623: goto            599
            //   626: aload_3        
            //   627: invokevirtual   java/io/InputStream.close:()V
            //   630: goto            643
            //   633: astore_2       
            //   634: ldc             "ExifInterface"
            //   636: ldc             "IOException occurred while closing InputStream"
            //   638: aload_2        
            //   639: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
            //   642: pop            
            //   643: aload_1        
            //   644: areturn        
            //   645: iload           12
            //   647: istore          13
            //   649: aload_3        
            //   650: astore_2       
            //   651: aload_0        
            //   652: getfield        q4/a$d.b:I
            //   655: getstatic       q4/a.S:[B
            //   658: arraylength    
            //   659: if_icmplt       727
            //   662: iconst_0       
            //   663: istore          13
            //   665: aload_3        
            //   666: astore_2       
            //   667: getstatic       q4/a.S:[B
            //   670: astore_1       
            //   671: iload           14
            //   673: istore          5
            //   675: aload_3        
            //   676: astore_2       
            //   677: iload           13
            //   679: aload_1        
            //   680: arraylength    
            //   681: if_icmpge       712
            //   684: aload_3        
            //   685: astore_2       
            //   686: aload_0        
            //   687: getfield        q4/a$d.d:[B
            //   690: iload           13
            //   692: baload         
            //   693: aload_1        
            //   694: iload           13
            //   696: baload         
            //   697: if_icmpeq       706
            //   700: iconst_0       
            //   701: istore          5
            //   703: goto            712
            //   706: iinc            13, 1
            //   709: goto            665
            //   712: iload           12
            //   714: istore          13
            //   716: iload           5
            //   718: ifeq            727
            //   721: aload_3        
            //   722: astore_2       
            //   723: aload_1        
            //   724: arraylength    
            //   725: istore          13
            //   727: aload_3        
            //   728: astore_2       
            //   729: new             Ljava/lang/StringBuilder;
            //   732: astore_1       
            //   733: aload_3        
            //   734: astore_2       
            //   735: aload_1        
            //   736: invokespecial   java/lang/StringBuilder.<init>:()V
            //   739: aload_3        
            //   740: astore_2       
            //   741: iload           13
            //   743: aload_0        
            //   744: getfield        q4/a$d.b:I
            //   747: if_icmpge       804
            //   750: aload_3        
            //   751: astore_2       
            //   752: aload_0        
            //   753: getfield        q4/a$d.d:[B
            //   756: iload           13
            //   758: baload         
            //   759: istore          5
            //   761: iload           5
            //   763: ifne            769
            //   766: goto            804
            //   769: iload           5
            //   771: bipush          32
            //   773: if_icmplt       789
            //   776: aload_3        
            //   777: astore_2       
            //   778: aload_1        
            //   779: iload           5
            //   781: i2c            
            //   782: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
            //   785: pop            
            //   786: goto            798
            //   789: aload_3        
            //   790: astore_2       
            //   791: aload_1        
            //   792: bipush          63
            //   794: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
            //   797: pop            
            //   798: iinc            13, 1
            //   801: goto            739
            //   804: aload_3        
            //   805: astore_2       
            //   806: aload_1        
            //   807: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
            //   810: astore_1       
            //   811: aload_3        
            //   812: invokevirtual   java/io/InputStream.close:()V
            //   815: goto            828
            //   818: astore_2       
            //   819: ldc             "ExifInterface"
            //   821: ldc             "IOException occurred while closing InputStream"
            //   823: aload_2        
            //   824: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
            //   827: pop            
            //   828: aload_1        
            //   829: areturn        
            //   830: aload_3        
            //   831: astore_2       
            //   832: aload_0        
            //   833: getfield        q4/a$d.d:[B
            //   836: astore_1       
            //   837: aload_3        
            //   838: astore_2       
            //   839: aload_1        
            //   840: arraylength    
            //   841: iconst_1       
            //   842: if_icmpne       902
            //   845: aload_1        
            //   846: iconst_0       
            //   847: baload         
            //   848: istore          13
            //   850: iload           13
            //   852: iflt            902
            //   855: iload           13
            //   857: iconst_1       
            //   858: if_icmpgt       902
            //   861: aload_3        
            //   862: astore_2       
            //   863: new             Ljava/lang/String;
            //   866: dup            
            //   867: iconst_1       
            //   868: newarray        C
            //   870: dup            
            //   871: iconst_0       
            //   872: iload           13
            //   874: bipush          48
            //   876: iadd           
            //   877: i2c            
            //   878: castore        
            //   879: invokespecial   java/lang/String.<init>:([C)V
            //   882: astore_1       
            //   883: aload_3        
            //   884: invokevirtual   java/io/InputStream.close:()V
            //   887: goto            900
            //   890: astore_2       
            //   891: ldc             "ExifInterface"
            //   893: ldc             "IOException occurred while closing InputStream"
            //   895: aload_2        
            //   896: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
            //   899: pop            
            //   900: aload_1        
            //   901: areturn        
            //   902: aload_3        
            //   903: astore_2       
            //   904: new             Ljava/lang/String;
            //   907: dup            
            //   908: aload_1        
            //   909: getstatic       q4/a.c0:Ljava/nio/charset/Charset;
            //   912: invokespecial   java/lang/String.<init>:([BLjava/nio/charset/Charset;)V
            //   915: astore_1       
            //   916: aload_3        
            //   917: invokevirtual   java/io/InputStream.close:()V
            //   920: goto            933
            //   923: astore_2       
            //   924: ldc             "ExifInterface"
            //   926: ldc             "IOException occurred while closing InputStream"
            //   928: aload_2        
            //   929: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
            //   932: pop            
            //   933: aload_1        
            //   934: areturn        
            //   935: aload_3        
            //   936: invokevirtual   java/io/InputStream.close:()V
            //   939: goto            952
            //   942: astore_1       
            //   943: ldc             "ExifInterface"
            //   945: ldc             "IOException occurred while closing InputStream"
            //   947: aload_1        
            //   948: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
            //   951: pop            
            //   952: aconst_null    
            //   953: areturn        
            //   954: astore_1       
            //   955: goto            996
            //   958: astore_3       
            //   959: aconst_null    
            //   960: astore_1       
            //   961: aload_1        
            //   962: astore_2       
            //   963: ldc             "ExifInterface"
            //   965: ldc             "IOException occurred during reading a value"
            //   967: aload_3        
            //   968: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
            //   971: pop            
            //   972: aload_1        
            //   973: ifnull          993
            //   976: aload_1        
            //   977: invokevirtual   java/io/InputStream.close:()V
            //   980: goto            993
            //   983: astore_1       
            //   984: ldc             "ExifInterface"
            //   986: ldc             "IOException occurred while closing InputStream"
            //   988: aload_1        
            //   989: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
            //   992: pop            
            //   993: aconst_null    
            //   994: areturn        
            //   995: astore_1       
            //   996: aload_2        
            //   997: ifnull          1017
            //  1000: aload_2        
            //  1001: invokevirtual   java/io/InputStream.close:()V
            //  1004: goto            1017
            //  1007: astore_2       
            //  1008: ldc             "ExifInterface"
            //  1010: ldc             "IOException occurred while closing InputStream"
            //  1012: aload_2        
            //  1013: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
            //  1016: pop            
            //  1017: aload_1        
            //  1018: athrow         
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                 
            //  -----  -----  -----  -----  ---------------------
            //  2      14     958    961    Ljava/io/IOException;
            //  2      14     954    958    Any
            //  16     21     495    503    Ljava/io/IOException;
            //  16     21     995    996    Any
            //  23     29     495    503    Ljava/io/IOException;
            //  23     29     995    996    Any
            //  129    136    495    503    Ljava/io/IOException;
            //  129    136    995    996    Any
            //  138    147    495    503    Ljava/io/IOException;
            //  138    147    995    996    Any
            //  149    157    495    503    Ljava/io/IOException;
            //  149    157    995    996    Any
            //  163    167    170    180    Ljava/io/IOException;
            //  184    191    495    503    Ljava/io/IOException;
            //  184    191    995    996    Any
            //  197    206    495    503    Ljava/io/IOException;
            //  197    206    995    996    Any
            //  208    217    495    503    Ljava/io/IOException;
            //  208    217    995    996    Any
            //  223    227    230    240    Ljava/io/IOException;
            //  244    252    495    503    Ljava/io/IOException;
            //  244    252    995    996    Any
            //  258    267    495    503    Ljava/io/IOException;
            //  258    267    995    996    Any
            //  269    290    495    503    Ljava/io/IOException;
            //  269    290    995    996    Any
            //  296    300    303    313    Ljava/io/IOException;
            //  317    324    495    503    Ljava/io/IOException;
            //  317    324    995    996    Any
            //  330    339    495    503    Ljava/io/IOException;
            //  330    339    995    996    Any
            //  341    349    495    503    Ljava/io/IOException;
            //  341    349    995    996    Any
            //  355    359    362    372    Ljava/io/IOException;
            //  376    383    495    503    Ljava/io/IOException;
            //  376    383    995    996    Any
            //  389    398    495    503    Ljava/io/IOException;
            //  389    398    995    996    Any
            //  400    408    495    503    Ljava/io/IOException;
            //  400    408    995    996    Any
            //  414    418    421    431    Ljava/io/IOException;
            //  435    443    495    503    Ljava/io/IOException;
            //  435    443    995    996    Any
            //  449    458    495    503    Ljava/io/IOException;
            //  449    458    995    996    Any
            //  460    489    495    503    Ljava/io/IOException;
            //  460    489    995    996    Any
            //  503    507    510    520    Ljava/io/IOException;
            //  524    531    495    503    Ljava/io/IOException;
            //  524    531    995    996    Any
            //  537    546    495    503    Ljava/io/IOException;
            //  537    546    995    996    Any
            //  548    561    495    503    Ljava/io/IOException;
            //  548    561    995    996    Any
            //  567    571    574    584    Ljava/io/IOException;
            //  588    595    495    503    Ljava/io/IOException;
            //  588    595    995    996    Any
            //  601    610    495    503    Ljava/io/IOException;
            //  601    610    995    996    Any
            //  612    620    495    503    Ljava/io/IOException;
            //  612    620    995    996    Any
            //  626    630    633    643    Ljava/io/IOException;
            //  651    662    495    503    Ljava/io/IOException;
            //  651    662    995    996    Any
            //  667    671    495    503    Ljava/io/IOException;
            //  667    671    995    996    Any
            //  677    684    495    503    Ljava/io/IOException;
            //  677    684    995    996    Any
            //  686    700    495    503    Ljava/io/IOException;
            //  686    700    995    996    Any
            //  723    727    495    503    Ljava/io/IOException;
            //  723    727    995    996    Any
            //  729    733    495    503    Ljava/io/IOException;
            //  729    733    995    996    Any
            //  735    739    495    503    Ljava/io/IOException;
            //  735    739    995    996    Any
            //  741    750    495    503    Ljava/io/IOException;
            //  741    750    995    996    Any
            //  752    761    495    503    Ljava/io/IOException;
            //  752    761    995    996    Any
            //  778    786    495    503    Ljava/io/IOException;
            //  778    786    995    996    Any
            //  791    798    495    503    Ljava/io/IOException;
            //  791    798    995    996    Any
            //  806    811    495    503    Ljava/io/IOException;
            //  806    811    995    996    Any
            //  811    815    818    828    Ljava/io/IOException;
            //  832    837    495    503    Ljava/io/IOException;
            //  832    837    995    996    Any
            //  839    845    495    503    Ljava/io/IOException;
            //  839    845    995    996    Any
            //  863    883    495    503    Ljava/io/IOException;
            //  863    883    995    996    Any
            //  883    887    890    900    Ljava/io/IOException;
            //  904    916    495    503    Ljava/io/IOException;
            //  904    916    995    996    Any
            //  916    920    923    933    Ljava/io/IOException;
            //  935    939    942    952    Ljava/io/IOException;
            //  963    972    995    996    Any
            //  976    980    983    993    Ljava/io/IOException;
            //  1000   1004   1007   1017   Ljava/io/IOException;
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_0124:
            //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
            //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
            //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
            //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
            //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        @Override
        public final String toString() {
            final StringBuilder k = a.k("(");
            k.append(q4.a.Q[this.a]);
            k.append(", data length:");
            return d.l(k, this.d.length, ")");
        }
    }
    
    public static final class e
    {
        public final int a;
        public final String b;
        public final int c;
        public final int d;
        
        public e(final String b, final int a, final int c) {
            this.b = b;
            this.a = a;
            this.c = c;
            this.d = -1;
        }
        
        public e(final String b, final int a, final int c, final int d) {
            this.b = b;
            this.a = a;
            this.c = c;
            this.d = d;
        }
    }
    
    public static final class f
    {
        public final long a;
        public final long b;
        
        public f(final long a, final long b) {
            if (b == 0L) {
                this.a = 0L;
                this.b = 1L;
                return;
            }
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append("/");
            sb.append(this.b);
            return sb.toString();
        }
    }
}
