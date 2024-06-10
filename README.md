IMAD5112 Practicum

Jolandri Cilliers ST10454062

https://github.com/ST10454062/WeatherExamApp.git

1. Purpose

The purpose of the weather app is to provide users with the weather
conditions for a week. The app allows the users to look at the average
temperature for the week and detailed description on the conditions for
the day. The app is targeted towards everyone.


2. Design Considerations

Splash screen:

The main image is the logo of the app and it will appear on the other
pages too. There are textviews for the name of the app, my name, and my
student number. There are two buttons for navigating to the main screen
and to exit the app.

Main Activity:

The icon imageview is on the top of the page. There are 4 edittexts and
1 textview. Each edittext holds an array of strings. The first one holds
the day of the week. The second one holds the minimum temperature. The
third one holds the maximum temperature and the last edittext hold any
comments on the weather condition. The textview is underneath the
weather condition and it hold the information for the average
temperature. There are 4 buttons each button serving a different
purpose. The save button, clear, exit, and view details.

Detailed View Screen:

The details screen has an icon on the top of the screen. It has two
textviews. The first displays common data. The second displays all the
information what the user has input in the mainActivity page. There is a
back button on the bottom of the page.

**General design**

The main audience of this app will be adults, it is important to focus
on the functionality of the app instead of the beauty of it. The app
should be easy on the eye and not overbearing in colours.

**Intuitive design**

Starting with the splashscreen, the design is very basic, the logo is on
the very top of the page with the textviews following underneath. Each
textview deplays the name of the app, my name, and my student number in
that order. The two buttons are placed on the bottom of the page for the
user's comfort.

The mainActivity page follows the same design with the logo on top and
the textview and button at the bottom

The detailed views screen displays all the details that were input on
the previous activity. The textviews shows the maximum and minimum
temperatures, weather conditions and average temperature for the week.
At the bottom there is a button dedirecting you to the first page

**Content prioritisation**

The essential content and components are on the pages. The buttons are
used to control the app, the imageview displays the logo.

**Legible Text Content**

The font is very easy to read, it is important to cater to all age
groups. The textviews that appears on the page is the biggest. This
textview is supposed to grab the user's attention.

**Make Interface Elements Clearly Visible**

All the component all clearly visible and placed in such a way to give
the user a pleasant experience. White space it used to create the look
of the app not being crowded. The textviews and buttons are spaced not
too far apart.

**Hand Position Controls**

All the buttons are placed at the bottom to maximize the hand position
placements. It is easy to reach them with either hand or both at the
same time. I decided not to place any button at the top for the same
reason.

**Images**
![](./e56725693d24a16717cc5f00455c7a0c8d4f14f0.png){width="2.2242825896762906in"
height="3.9558902012248467in"}![](./bb1d321a30e1afd5573f42b781eb45123de81e69.png){width="2.2315168416447944in"
height="3.969335083114611in"}![](./f39de93e42207c506fd39f1621e492b52df4cb04.png){width="2.234955161854768in"
height="3.9694181977252843in"}



**Pseudocode**

**SplashScreen:**

Display AppName, DeveloperName, StudentNumber, AppLogo
Display startButton \"Start\"
Display exitButton \"Exit"
OnButtonClick startButton:
   Go to MainScreen
OnButtonClick exitButton:
   ExitApp

**MainScreen:**

Display InputField dates
Display InputField minTemperatures
Display InputField maxTemperatures
Display InputField weatherConditions
Display saveBtn \"Save\"
Display clearBtn \"Clear \"
Display viewDetailsBtn \"Detailed View\"
Declare dates as a string array
Declare minTemperatures as an int array
Declare maxTemperatures as an int array
Declare weatherConditions as a string array

OnButtonClick saveBtn:
 If InputFields are valid:
  Save Data to ArrayLists
  Show Message \"Data Saved\"
Else:
     Show ErrorMessage \"Please fill all fields"
Calculate AverageScreenTime:
   totalTemperature = Sum of all minTemperatures + maxTemperatures
   averageTemperature = totalTemperature/ size of dates
OnButtonClick clearBtn:
   Clear InputFields
   Show Message \"Data Cleared\"
OnButtonClick viewDetailsBtn:
   Navigate to DetailedView with ArrayLists Data

**DetailedView:**

For each dates in ArrayLists:
   Display dates, minTemperatures, maxTemperatures, weatherConditions



Resources:

Avasthi Tapan. 2015. Baeldung 
Find the average of all items in the list in kotlin, 19 November 2024.  
[Online]. Available at:  
https://www.baeldung.com/kotlin/list-mean-value
[Accessed 10 June 2024]. 

Dribble. 2024. Apple Weather – Micro Interaction Icon 
[Online]. Available at:  
https://dribbble.com/shots/3945728-Apple-Weather-Micro-Interaction-Icon
[Accessed 10 June 2024]. 







