# Anim Dialog

Animdialog for android, a Lottie powered simple delightful popup dialog with both animated and non animated type.

### Screenshot
[![](https://github.com/hishd/AnimationDialog/raw/master/images/animdialog.gif)](https://github.com/hishd/AnimationDialog/raw/master/images/animdialog.gif)

### Installation & Setup

------------

The easiest way to use Animdialog is to add the android library to your projects dependencies.

##### Maven
```
<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
```
add to dependency,
```
<dependency>
	    <groupId>com.github.hishd</groupId>
	    <artifactId>AnimationDialog</artifactId>
	    <version>1.4</version>
	</dependency>
```

##### Gradle
Add the repository to your project build.gradle

```
allprojects {
    repositories {
        google()
        jcenter()
        maven { url 'https://jitpack.io' }
    }
}
```
add dependency,
```
dependencies {
	        implementation 'com.github.hishd:AnimationDialog:1.4'
	}
```

## Usage

##### Important
Make sure you create the **asset** folder under ***projectFolder\app\src\main***  and put your animation files (.json) files in the **asset** folder.

You can download the animation files from [Lottiefiles](https://lottiefiles.com/ "Lottiefiles")

Do not forget to check out my animations also 😊😊 [HishD](https://lottiefiles.com/user/122908 "HishD")

**When downloading animation files from Lottie download them as .json files.**

#### Show animated single button dialog
```
new AnimDialog(MainActivity.this)
                        .createAnimatedSingleDialog()
                        .setAnimation("loading.json")
                        .setBackgroundColor(R.color.color1)
                        .setButton1BackgroundColor(R.color.button1)
                        .setTitle("Loading Mail")
                        .setTitleColor(R.color.color_title)
                        .setContentColor(R.color.color_text)
                        .setContent("Example content to illustrate a loading animation")
                        .setButton1("OK", 0, false, new AnimDialog.AnimOnClickListener() {
                            @Override
                            public void onClicked(Dialog dialog) {
                                Toast.makeText(getApplicationContext(), "Clicked OK", Toast.LENGTH_SHORT).show();
                                dialog.dismiss();
                            }
                        }).show();
```
#### Show animated dual button dialog
```
new AnimDialog(MainActivity.this)
                        .createAnimatedDualDialog()
                        .setAnimation("location.json")
                        .setBackgroundColor(R.color.color3)
                        .setButton1BackgroundColor(R.color.button1)
                        .setButton2BackgroundColor(R.color.button2)
                        .setTitleColor(R.color.color_title)
                        .setContentColor(R.color.color_text)
                        .setTitle("Loading Location")
                        .setContent("Example content to illustrate a Location animation")
                        .setButton1("OK", 0, false, new AnimDialog.AnimOnClickListener() {
                            @Override
                            public void onClicked(Dialog dialog) {
                                Toast.makeText(getApplicationContext(), "Clicked OK", Toast.LENGTH_SHORT).show();
                                dialog.dismiss();
                            }
                        })
                        .setButton2("Cancel", 0, false, new AnimDialog.AnimOnClickListener() {
                            @Override
                            public void onClicked(Dialog dialog) {
                                Toast.makeText(getApplicationContext(), "Clicked Cancel", Toast.LENGTH_SHORT).show();
                                dialog.dismiss();
                            }
                        }).show();
```
#### Show non animated single button dialog
```
new AnimDialog(MainActivity.this)
                        .createNonAnimatedSingleDialog()
                        .setImage(getDrawable(R.drawable.profile_blank))
                        .setButton1BackgroundColor(R.color.button3)
                        .setBackgroundColor(R.color.color3)
                        .setTitleColor(R.color.color_title)
                        .setContentColor(R.color.color_text)
                        .setTitle("Loading Contacts")
                        .setContent("Example content to illustrate a sample non anim dialog.")
                        .setButton1("OK", 0, false, new AnimDialog.AnimOnClickListener() {
                            @Override
                            public void onClicked(Dialog dialog) {
                                Toast.makeText(getApplicationContext(), "Clicked OK", Toast.LENGTH_SHORT).show();
                                dialog.dismiss();
                            }
                        }).show();
```
#### Show non animated dual button dialog
```
new AnimDialog(MainActivity.this)
                        .createNonAnimatedDualDialog()
                        .setImage(getDrawable(R.drawable.dummy_image))
                        .setButton1BackgroundColor(R.color.button1)
                        .setButton2BackgroundColor(R.color.button4)
                        .setBackgroundColor(R.color.color1)
                        .setTitleColor(R.color.color_title)
                        .setContentColor(R.color.color_text)
                        .setTitle("Loading Images")
                        .setContent("Example content to illustrate a sample non anim dialog.")
                        .setButton1("OK", 0, false, new AnimDialog.AnimOnClickListener() {
                            @Override
                            public void onClicked(Dialog dialog) {
                                Toast.makeText(getApplicationContext(), "Clicked OK", Toast.LENGTH_SHORT).show();
                                dialog.dismiss();
                            }
                        })
                        .setButton2("Cancel", 0, false, new AnimDialog.AnimOnClickListener() {
                            @Override
                            public void onClicked(Dialog dialog) {
                                Toast.makeText(getApplicationContext(), "Clicked Cancel", Toast.LENGTH_SHORT).show();
                                dialog.dismiss();
                            }
                        }).show();
```

#### Usages of the methods
| Method Name  | Operation   |
| ------------ | ------------ |
| createNonAnimatedSingleDialog()  | Create a non animated single button dialog  |
| createNonAnimatedDualDialog()  | Create a non animated dual button dialog  |
| createAnimatedDualDialog()  | Create a animated dual button dialog  |
| createAnimatedSingleDialog()  | Create a animated single button dialog  |
| setAnimation("animationName.json")  | Pass the animation name as the parameter  |
| setBackgroundColor(int color)  | Sets the dialog background color  |
| setButton1BackgroundColor(int color)  | Sets the button 1 background color  |
| setButton2BackgroundColor(int color)  | Sets the button 2 background color  |
| setTitle("Title Name") | Sets the title of the dialog  |
| setTitleColor(int color)  | Sets the color of the title  |
| setContent("Content")  | Sets the content of the dialog  |
| setContentColor(int color)  | Sets the content color  |
| setButton1("Button Text", int buttonTextColor, AnimDialog.AnimOnClickListener)  |  Sets the Text of the button , Color of the button (0 = white) and OnClickListener for button |
| setButton2("Button Text", int buttonTextColor, AnimDialog.AnimOnClickListener)  |  Sets the Text of the button , Color of the button (0 = white) and OnClickListener for button |

###### Please Refer the Sample project for more information.

