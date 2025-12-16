# Teezy - T-Shirt E-Commerce App

A modern Android e-commerce application built with Kotlin for browsing and purchasing t-shirts. Teezy provides a complete shopping experience with user authentication, product browsing, wishlist functionality, order tracking, and secure checkout.

## 📱 Features

- **User Authentication**: Secure login and registration system
- **Onboarding Flow**: Engaging three-screen onboarding experience for new users
- **Product Browsing**: Browse through a curated collection of t-shirts
- **Product Details**: View detailed product information with color and size selection
- **Wishlist**: Save favorite products for later
- **Shopping Cart**: Add items to cart and manage quantities
- **Order Tracking**: View and track your orders
- **Secure Checkout**: Complete order flow with payment integration
- **Account Management**: User profile and account settings
- **Bottom Navigation**: Intuitive navigation between main sections (Home, Wishlist, Orders, Account)

## 🛠️ Tech Stack

- **Language**: Kotlin
- **Platform**: Android
- **Minimum SDK**: 29 (Android 10)
- **Target SDK**: 34 (Android 14)
- **Architecture**: Native Android with Activities
- **UI Components**:
  - Material Design Components
  - Bottom Navigation
  - Card View
  - Grid Layout
  - Constraint Layout

## 📦 Dependencies

- AndroidX Core KTX
- AndroidX AppCompat
- Material Design Components
- AndroidX Activity
- AndroidX ConstraintLayout
- AndroidX GridLayout

## 🚀 Getting Started

### Prerequisites

- Android Studio Hedgehog | 2023.1.1 or later
- JDK 11 or higher
- Android SDK 29 or higher
- Gradle 8.7.2

### Installation

1. Clone the repository:
```bash
git clone https://github.com/yourusername/Teezy.git
cd Teezy
```

2. Open the project in Android Studio

3. Sync Gradle dependencies

4. Connect an Android device or start an emulator (Android 10 or higher)

5. Run the app:
```bash
./gradlew installDebug
```

Or simply click the "Run" button in Android Studio.

## 📁 Project Structure

```
app/
├── src/
│   ├── main/
│   │   ├── java/com/example/Teezy/
│   │   │   ├── Launch.kt              # Launch/splash screen
│   │   │   ├── onBoardingOne.kt      # First onboarding screen
│   │   │   ├── onBoradingTwo.kt      # Second onboarding screen
│   │   │   ├── onBoardingThree.kt    # Third onboarding screen
│   │   │   ├── Login.kt              # Login activity
│   │   │   ├── Register.kt           # Registration activity
│   │   │   ├── Home.kt               # Main home screen
│   │   │   ├── Product.kt            # Product details
│   │   │   ├── Wishlist.kt          # Wishlist screen
│   │   │   ├── Orders.kt            # Order history
│   │   │   ├── Checkout.kt          # Checkout process
│   │   │   ├── Payment.kt            # Payment screen
│   │   │   ├── Success.kt            # Order confirmation
│   │   │   └── Account.kt            # User account
│   │   ├── res/
│   │   │   ├── layout/                 # XML layout files
│   │   ├── drawable/                   # Images and drawables
│   │   ├── values/                     # Strings, colors, themes
│   │   └── mipmap/                     # App icons
│   └── test/                           # Unit tests
└── build.gradle.kts                    # App-level dependencies
```

## 🎨 Screens

1. **Launch Screen**: Entry point with splash screen
2. **Onboarding**: Three-screen introduction to the app
3. **Authentication**: Login and registration screens
4. **Home**: Product catalog with grid layout
5. **Product Details**: Individual product view with color/size selection
6. **Wishlist**: Saved products
7. **Orders**: Order history and tracking
8. **Checkout**: Shopping cart and checkout process
9. **Payment**: Payment information entry
10. **Success**: Order confirmation
11. **Account**: User profile management

## 📝 Building

To build the debug APK:
```bash
./gradlew assembleDebug
```

The APK will be located at: `app/build/outputs/apk/debug/app-debug.apk`

## 🧪 Testing

Run unit tests:
```bash
./gradlew test
```

Run instrumented tests:
```bash
./gradlew connectedAndroidTest
```

## 📄 License

This project is part of a Mobile Application Development (MAD) course assignment.

## 👨‍💻 Contributing

This is an educational project created for SLIIT - Second Year Second Semester MAD (Mobile Application Development) course.

## 📧 Contact

For questions or support, please open an issue in this repository.

---

**Built with ❤️ using Kotlin & Android**

