from WarrantyService import WarrantyService

if __name__ == '__main__':
    service = WarrantyService()
    service.register_warranty("Laptopl", "2024-12-31")
    print(service.check_warranty("Laptopl"))
    print(service.check_warranty(""))


    service2 = WarrantyService()
    print(service is service2)

