package com.example.electronics_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_layout.*

class MainActivity : AppCompatActivity() {

    var layoutManager: RecyclerView.LayoutManager? = null
    val p1=Product("June 2017 · Sceptre · 50 in · LCD · 1080p · 44.1 in wide · LED · Flat · High Definition · 4 HDMI Ports",209.2,"Brown","imag1","id1","The S-Series Full HD TCL Roku TV puts all your entertainment favorites in one place, allowing seamless access to over 450,000 movies and TV episodes, your cable box, gaming console, and other devicesall from your simple, intuitive interface. The super-simple remote and dual-band Wi-Fi make it fast and easy to access your favorite content in Full HD. Connect all your favorite devices with the three HDMI inputs or cast content from your smartphone or tablet with the free mobile app. The built-in TV tuner makes this the ultimate cord-cutting TV as it also gives you the ability to access free, over-the-air HD content")
    val p2=Product("Google Pixel 4 XL - 128GB - White - Google Fi - 6.3\" display, QHD + OLED - Click studio-like photos & unlimited storage",999.98,"White","imag1","id1","Google's most helpful phone yet. Click studio-like photos with the evolved camera and get free unlimited storage with Google Photos when you buy Google Pixel 4. Multitask like a pro with the 5.7 inch FHD always-on display with Motion Sense, an evolved camera, and the new Google Assistant. Want to check the news when on treadmill or create your playlist while eating tacos? Quick Gestures let's you control your phone without touching it. The improved Face Unlock let's you securely unlock your Pixel 4, make payments, and get into apps in a flash.")
    val p3=Product("HP LaserJet Pro M15a Monochrome Compact Laser Printer, White",32.2,"Brown","imag1","id1","Get legendary quality with the HP LaserJet Pro M15athe world's smallest in-class laser printer. Produce professional-quality documents time after time, with print speeds of up to 19 pages per minute. HP Auto-On/Auto-Off Technology helps you save energy, and the pre-installed Original HP Toner cartridges help you speed through print jobs")
    val p4=Product("June 2017 · Sceptre · 50 in · LCD · 1080p · 44.1 in wide · LED · Flat · High Definition · 4 HDMI Ports",209.2,"Brown","imag1","id1","The S-Series Full HD TCL Roku TV puts all your entertainment favorites in one place, allowing seamless access to over 450,000 movies and TV episodes, your cable box, gaming console, and other devicesall from your simple, intuitive interface. The super-simple remote and dual-band Wi-Fi make it fast and easy to access your favorite content in Full HD. Connect all your favorite devices with the three HDMI inputs or cast content from your smartphone or tablet with the free mobile app. The built-in TV tuner makes this the ultimate cord-cutting TV as it also gives you the ability to access free, over-the-air HD content")

    val p5=Product("Google Pixel 4 XL - 128GB - White - Google Fi - 6.3\" display, QHD + OLED - Click studio-like photos & unlimited storage",999.98,"White","imag1","id1","Google's most helpful phone yet. Click studio-like photos with the evolved camera and get free unlimited storage with Google Photos when you buy Google Pixel 4. Multitask like a pro with the 5.7 inch FHD always-on display with Motion Sense, an evolved camera, and the new Google Assistant. Want to check the news when on treadmill or create your playlist while eating tacos? Quick Gestures let's you control your phone without touching it. The improved Face Unlock let's you securely unlock your Pixel 4, make payments, and get into apps in a flash.")

    val p6=Product("June 2017 · Sceptre · 50 in · LCD · 1080p · 44.1 in wide · LED · Flat · High Definition · 4 HDMI Ports",209.2,"Brown","imag1","id1","The S-Series Full HD TCL Roku TV puts all your entertainment favorites in one place, allowing seamless access to over 450,000 movies and TV episodes, your cable box, gaming console, and other devicesall from your simple, intuitive interface. The super-simple remote and dual-band Wi-Fi make it fast and easy to access your favorite content in Full HD. Connect all your favorite devices with the three HDMI inputs or cast content from your smartphone or tablet with the free mobile app. The built-in TV tuner makes this the ultimate cord-cutting TV as it also gives you the ability to access free, over-the-air HD content")

    //    val pList= arrayOf(p1,p2,p3,p4,p5)
    val pList=ArrayList<Product>()
    val images= intArrayOf(R.drawable.tv,R.drawable.mobile,R.drawable.printer,R.drawable.tv,R.drawable.laptop,R.drawable.tv)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val r1=findViewById<RecyclerView>(R.id.recyclerId)
        pList.add(p1)
        pList.add(p2)
        pList.add(p3)
        pList.add(p4)
        pList.add(p5)
        pList.add(p6)
        val cAdapter=CustomAdapter(this,pList,images)
//        r1 = findViewById<RecyclerView>(R.id.rv)
//        s1 = resources.getStringArray(R.array.fruits);
//        s2 = resources.getStringArray(R.array.desc);
//        s3 = resources.getStringArray(R.array.detail);
//        madr = MyAdapter(this,s1 as Array<String>, s2 as Array<String>,imageges,s3 as Array<String>)
        layoutManager = LinearLayoutManager(this)
        r1?.layoutManager = layoutManager
        r1?.adapter =cAdapter

    }
}
