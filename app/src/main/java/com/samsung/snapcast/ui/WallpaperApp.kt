package com.samsung.snapcast.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavGraph.Companion.findStartDestination

import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navOptions
import com.samsung.snapcast.about.navigation.aboutScreen
import com.samsung.snapcast.about.navigation.navigateToAbout
import com.samsung.snapcast.collection.ui.navigation.collectionScreen
import com.samsung.snapcast.collection.ui.navigation.navigateToCollection
import com.samsung.snapcast.designsystem.theme.WallpaperTheme
import com.samsung.snapcast.home.navigation.detailItemRouteScreen
import com.samsung.snapcast.home.navigation.homeRoute
import com.samsung.snapcast.home.navigation.homeScreen
import com.samsung.snapcast.home.navigation.navigateToDetailItem
import com.samsung.snapcast.home.navigation.navigateToHome
import com.samsung.snapcast.navigation.BottomBarDestination

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
){
    val bottomBarItem = BottomBarDestination.values().asList()
    Scaffold(
        bottomBar = {
          BottomBar(destination = bottomBarItem, navController = navController)
        },
        modifier = modifier,
    ) {innerPadding ->
        NavHost(navController = navController, startDestination = homeRoute,
            modifier= modifier.padding(innerPadding)) {

            homeScreen(
                navigateToDetail = {
                    navController.navigateToDetailItem(
                        it
                    )
                }
            )
            collectionScreen()
            aboutScreen()
            detailItemRouteScreen(
                onBackPress = navController::popBackStack
            )

        }
    }

}

@Composable
private fun BottomBar(
    destination: List<BottomBarDestination>,
    navController: NavHostController,
    modifier: Modifier = Modifier
) {

    NavigationBar(modifier = modifier) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val sufixPage = "_page"
        destination.forEach {item ->
            val isSelected = navBackStackEntry?.destination?.route?.contains(item.name,true) ?: false
            val name = stringResource(id = item.titleTextId)
            NavigationBarItem(
                icon = {
                        if(isSelected){
                            Icon(
                                imageVector = item.selectedIcon,
                                contentDescription = name + sufixPage
                            )
                        }else
                        {
                            Icon(
                                imageVector = item.unselectedIcon,
                                contentDescription = name + sufixPage
                            )
                        }
                },
                label = {
                    Text(name)
                },
                selected = isSelected,
                onClick = {
                   navigateTopLevel(item,navController)
                }
            )
        }
    }
}

private fun navigateTopLevel(bottomBarDestination: BottomBarDestination,navController: NavHostController){
    val navOptions = navOptions {
        popUpTo(navController.graph.findStartDestination().id){
            saveState =true
        }
        restoreState = true
        launchSingleTop = true
    }
    when(bottomBarDestination){
        BottomBarDestination.HOME -> navController.navigateToHome(navOptions = navOptions)
        BottomBarDestination.COLLECTION -> navController.navigateToCollection(navOptions = navOptions)
        BottomBarDestination.ABOUT -> navController.navigateToAbout(navOptions = navOptions)
    }
}

@Preview(showBackground = true)
@Composable
fun WallpaperAppPreview(){
    WallpaperTheme {
        AppHost()
    }
}