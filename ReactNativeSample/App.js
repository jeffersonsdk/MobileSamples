/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow
 */

import React, { Fragment,Component } from 'react';
import {
  SafeAreaView,
  StyleSheet,
  ScrollView,
  View,
  Text,
  StatusBar,
  NativeModules
} from 'react-native';



export default class App extends Component {
  componentDidMount(){
const jeff = NativeModules.JeffersonSDK

jeff.start()
  }
  render() {
    return (
      <View >
 
      </View>
    );
  }
}


