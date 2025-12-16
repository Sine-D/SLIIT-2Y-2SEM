# Habito - Habit Tracker App 📱

A comprehensive Android application for tracking daily habits, monitoring mood, and maintaining a healthy lifestyle. Habito helps you build better routines and track your personal growth journey.

## 📋 About

Habito is a modern habit tracking application developed as part of the Mobile Application Development (MAD) course. The app provides users with an intuitive interface to create, manage, and track their daily habits while also monitoring their mood patterns over time.

## ✨ Features

### 🎯 Habit Tracking
- Create custom habits with personalized categories
- Set daily targets and track progress
- View habit history and completion streaks
- Organize habits by category (Health, Wellness, Productivity, Exercise, Mindfulness, Nutrition)
- Set reminder notifications to stay on track

### 😊 Mood Tracking
- Log daily mood entries with emoji-based interface
- Calendar view to visualize mood patterns
- Trend analysis with interactive charts
- Historical mood data tracking

### 💧 Hydration Reminders
- Automated hydration reminders
- Customizable notification intervals
- Background service to ensure reminders persist
- Boot-completed receiver for persistent notifications

### 🎨 User Experience
- Modern, clean Material Design UI
- Smooth navigation with Navigation Component
- Splash screen and onboarding flow
- Dark mode support
- Secure user authentication

## 🛠️ Tech Stack

- **Language**: Kotlin
- **Architecture**: MVVM (Model-View-ViewModel)
- **UI**: Material Design, View Binding, Data Binding
- **Navigation**: Navigation Component with Safe Args
- **Background Tasks**: WorkManager
- **Data Storage**: DataStore Preferences
- **Chart Library**: MPAndroidChart
- **Calendar**: Material Calendar View
- **SVG Rendering**: AndroidSVG
- **Min SDK**: 26 (Android 8.0)
- **Target SDK**: 36

## 📦 Dependencies

- AndroidX Core KTX
- Material Design Components
- Navigation Component
- Lifecycle Components
- WorkManager
- DataStore Preferences
- Gson
- MPAndroidChart
- Material Calendar View
- AndroidSVG

## 🚀 Installation

### Prerequisites
- Android Studio (latest version)
- Android SDK (API 26 or higher)
- Gradle 8+

### Steps

1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/habito.git
   cd habito
   ```

2. **Open in Android Studio**
   - Open Android Studio
   - Select "Open an Existing Project"
   - Navigate to the cloned repository folder

3. **Sync Gradle**
   - Android Studio will automatically sync the Gradle files
   - Wait for the sync to complete

4. **Run the app**
   - Connect an Android device or start an emulator
   - Click the "Run" button or press `Shift + F10`
   - Select your device and the app will install and launch

### Build Configuration
- **Application ID**: `com.example.habito`
- **Version Code**: 1
- **Version Name**: 1.0

## 📱 Usage

### Getting Started
1. Launch the app from your device
2. Complete the onboarding process
3. Register a new account or log in
4. Start adding your first habit!

### Creating Habits
- Navigate to the Habits section
- Tap the "+" button to add a new habit
- Choose a title, icon, category, and set your daily target
- Enable reminders if desired

### Tracking Mood
- Go to the Mood section
- Select your current mood from the emoji picker
- Add notes (optional)
- View your mood history and trends over time

### Managing Settings
- Access settings from the bottom navigation
- Customize reminder preferences
- View app information

## 📁 Project Structure

```
app/src/main/
├── java/com/example/habito/
│   ├── data/
│   │   ├── model/          # Data models (Habit, Mood, User, etc.)
│   │   └── repository/     # Data repositories
│   ├── ui/
│   │   ├── auth/           # Authentication screens
│   │   ├── dashboard/      # Dashboard
│   │   ├── habits/         # Habit management
│   │   ├── mood/           # Mood tracking
│   │   └── settings/       # Settings screen
│   ├── notifications/      # Notification receivers
│   ├── repository/         # Auth repository
│   ├── utils/              # Utility classes
│   └── work/               # Background workers
├── res/
│   ├── layout/             # XML layouts
│   ├── drawable/           # Drawable resources
│   ├── values/             # Strings, colors, themes
│   └── navigation/         # Navigation graphs
└── AndroidManifest.xml
```

## 🏗️ Architecture

The app follows the **MVVM (Model-View-ViewModel)** architecture pattern:

- **Model**: Data classes and repositories handle data operations
- **View**: Activities and Fragments display the UI
- **ViewModel**: Manages UI-related data and business logic

### Key Components
- **Repository Pattern**: Centralized data management
- **LiveData**: Observable data holders
- **View Binding**: Type-safe view references
- **WorkManager**: Reliable background task execution

## 🧪 Testing

```bash
# Run unit tests
./gradlew test

# Run instrumented tests
./gradlew connectedAndroidTest
```

## 📄 Permissions

The app requires the following permissions:
- `WAKE_LOCK`: Keep device awake for notifications
- `SCHEDULE_EXACT_ALARM`: Schedule exact alarm times
- `POST_NOTIFICATIONS`: Display notifications
- `FOREGROUND_SERVICE`: Run background services
- `RECEIVE_BOOT_COMPLETED`: Restart reminders after reboot
- `ACTIVITY_RECOGNITION`: Optional step counter support

## 🤝 Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📝 License

This project is developed for educational purposes as part of the MAD course at SLIIT.

## 👨‍💻 Author

**SLIIT - 2nd Year 2nd Semester**
- Course: Mobile Application Development
- Semester: 2nd Year 2nd Sem
- Project: Habito - Habit Tracker App

## 🙏 Acknowledgments

- Android Development Community
- Material Design Team
- Open-source library contributors

---

Made with ❤️ using Kotlin and Android

