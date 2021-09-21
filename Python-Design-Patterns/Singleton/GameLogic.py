from SingletonCls import SingletonClass

def GetTheTiles(playerId):
	onlyInstance = SingletonClass()

	print("Id of the Instance: ", id(onlyInstance))
	print(onlyInstance.getLetterList())

	playerTiles = onlyInstance.getTiles(7)
	print("Player {} Tiles: {}".format(playerId, playerTiles))
	print("Remaining Tiles {}".format(onlyInstance.getLetterList()))