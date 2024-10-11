package main

import "fmt"

type Carro struct {
	marca  string
	modelo string
	ano    string
}

func main() {
	var carro1 Carro
	var carro2 Carro
	var carro3 Carro

	carro1 = Carro{
		marca:  "Fiat",
		modelo: "Uno",
		ano:    "2020",
	}
	carro2 = Carro{
		marca:  "Volkswagen",
		modelo: "Gol",
		ano:    "2019",
	}
	carro3 = Carro{
		marca:  "Chevrolet",
		modelo: "Camaro",
		ano:    "2015",
	}

	fmt.Println(carro1, carro2, carro3)
}
