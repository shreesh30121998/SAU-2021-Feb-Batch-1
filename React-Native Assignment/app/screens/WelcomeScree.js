import React from 'react';
import { Image, ImageBackground, StyleSheet, View, Text } from 'react-native';
import WelcomeComp from '../components/WelcomeComp';

function WelcomeScree(props) {
    return (
        <ImageBackground source={require('../assets/sunset.jpg')} style={styles.image}>
            <View style={styles.logocontainer}>
                <Image source={require("../assets/logo.png")} style={styles.logo}/>
                <WelcomeComp title="How's it going?"></WelcomeComp>
            </View>
            <View style={styles.loginbutton}><WelcomeComp title="Let's get"></WelcomeComp></View>
            <View style={styles.registerbutton}><WelcomeComp title="Started"></WelcomeComp></View>
        </ImageBackground>
        
    );
}
const styles = StyleSheet.create({
   
    image: {
      flex: 1,
      justifyContent:"flex-end",
      alignItems:"center"
    },
    logocontainer: {
        position:'absolute',
        top:250,
        alignItems:"center"
    },
    
    logo: {
        width:80,
        height:80,
        backgroundColor: 'transparent',
    },
    loginbutton: {
        width: '100%',
        height: 70,
        backgroundColor: '#d6cac9',
        opacity: .8,
    },
    registerbutton: {
        width: '100%',
        height: 70,
        backgroundColor: '#71acf5',
        opacity: .8
    }
  });
export default WelcomeScree;